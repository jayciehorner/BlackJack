package chestysCasino;

import java.util.Scanner;

import chestysCasino.Game.PlayerData;
import chestysCasino.Person.*;
import chestysCasino.Player.*;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.io.*;
import java.time.LocalDate;

public class Game {
	static Scanner in = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		Person p = new Person();
		//////////////////// Print previous players to console///////////////////
		readData();
		//////////////////// Game starts///////////////////
		System.out.println("Welcome to Chesty's Casino! Please enter your name to begin.");
		p.setName(Game.in.nextLine());
		do {
			if (p.getName() == (null)) {
				System.out.println("Please enter your name to begin.");
				p.setName(in.nextLine());
				p.setName(p.getName().substring(0, 1).toUpperCase()+ p.getName().substring(1));
				System.out.println("Welcome " + p.getName() + "! Let's begin.");

			} else {
				p.setName(p.getName().substring(0, 1).toUpperCase()+ p.getName().substring(1));
				System.out.println("Welcome " + p.getName() + "! Let's begin.");
				break;
			}
		} while (true);
		////////////////////Stores name to hash map///////////////////
		Map<String, String> stats = new HashMap<>();
		stats.put(p.getName(), String.valueOf(Player.b.getBank()));

		//////////// END OF GAME ///////////////
		Game.endOfGame();
	}

	public static void endOfGame() throws Exception{
		System.out.println("Would you like to play again? Please enter Y or N.");
		String playAgain = in.next();
		do {
			if (playAgain.equalsIgnoreCase("N")) {
				System.out.println("Goodbye, come play again soon!");
				writeData();
				break;

			} else if (playAgain.equalsIgnoreCase("Y")) {
				Deck.shuffle();
				/////////////////// LOOP BACK TO GAME //////////////////

			} else {
				System.out.println("Please enter Y or N.");
				playAgain = in.next();
			}
		} while (true);

	}

	public static void readData() throws Exception {
		/////////////////////// READS PLAYER DATA FROM FILE AND PRINTS TO
		/////////////////////// CONSOLE//////////////////////////////////////
		try (InputStream in = new FileInputStream(new File("PlayerData.txt"))) {
			int b;
			while ((b = in.read()) != -1) {
				System.out.println((char) b);
			}
		}

	}

	public static void writeData() throws Exception {
		try (FileWriter out = new FileWriter(new File("PlayerData.txt"))) {
			out.write(stats.toString());
		}

	}

	static class PlayerData{
		static Person p = new Person();
		Player b = new Player();
//		private double bank;
		public PlayerData() {
			super();
		}
		public PlayerData(String name, int bank) {
			super();
			p.setName(name);
			b.setBank(bank);
		}

		@Override
		public String toString() {
			return "PlayerData [name=" + p.getName() + ", bank=" + b.getBank() + LocalDate.now() + "]";
		}

	}}
