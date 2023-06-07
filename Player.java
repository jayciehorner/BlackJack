package chestysCasino;

import java.util.ArrayList;

public class Player extends Person{
	
	//private String name;
	//email or id  ??? serializable
	private int bet;
	private int bank;
	private Hand hand;
	private int deposit; 
	
	ArrayList<Player> players = new ArrayList<Player>();
	//Create 6 players
	//max size 6 
	
	Player dealer = new Player();
	
	
	public Player() {
		
	}
	
	//setName = in.next();
	//bank setup to initial deposit
	//or just do setBank = in.next
	//deposit option resets bank 
	//so it become 
	
	public void addFunds() {
		bank += deposit;
	}
	
	public void cashOut() {
		bank = 0;
	}
	
	public void win() {
		bank += bet;
		bet = 0;
	}
	
	public void loss() {
		bank -= bet;
		bet = 0;
	}
	
	public void blackJack() {
		bank += bet * (3/2);
		bet = 0;
	}
	
	public void bust() {
		bank -= bet;
		bet = 0;
	}
	
	public void push() {
		bet = 0;
	}
	
	public void doubleDown() {
		bet *= 2;
		//players.
		//pulls one card 
		//so deck.next();
		//bet = 0;
	}
	
	public void stay() {
		for(int i = 0; i < players.size(); i++) {
			players.get(i);
		}
	}
	
	public void playerTurn() {
		for(int i = 0; i < players.size(); i++) {
			players.get(i);
		}
	}
	

	
	public void insurance() {
		
		//if(dealer.hasAce)
		//create hasAce method 
		//both for this and calculateHandValue method in Hand class 
		//dealer showing ace 
		//pays 2/1
		//half players bet
		//new bet?
	}

}
