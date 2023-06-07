package chestysCasino;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

import chestysCasino.Card.Value;

public class Hand { 
	
	private ArrayList<Card> hand;// = new ArrayList<Card>();
	private Hand hand2;

	public Hand() {
		hand = new ArrayList<Card>();
		//collection of cards
		//.sublist 
	}
	
	public Hand(ArrayList<Card> cards) {
		this.hand = cards;
	}
		
	public void hit(Deck deck) {
		hand.add(deck.pullRandom());		
	}
	
	public void stay(ArrayList<Player> players) {
		for(int i = 0; i < players.size(); i++) {
			players.get(i);
			//playerTurn(i);
		}
		// move to next hand in order
		//arraylist of players?

	}
	
	public void split() {
		hand = (ArrayList<Card>) hand.subList(0, 1);
		hand2 = new Hand ((ArrayList<Card>) (hand.subList(1, 2)));
		
		//boolean for isSplit()
		//sublist from index and to index
		// create new hand[] with each card
		// if cards at index 0 and 1 == new card[]
	}

	public int getCards() {//do we need net next for random card
		return 0;
	}
	
	public static int calculateTotalHandValue(ArrayList<Card> hand) {
		int x;
		int sum = 0;
		int aces = 0;
		if(hasAce(hand)) {
			for(int i = 0; i < hand.size(); i++) {
				if(hand.get(i).getRank() != Card.Value.ACE) {
					x = Card.toInt(hand.get(i).getRank());
					sum += x; 
				}else {
					aces++;
				}
				
			}
			if(21 - sum >= 11 + (aces - 1)) {
				sum += 11 + (aces - 1);
			}else {
				sum += 1 * aces;
			}
		}else {
			for(int i = 0; i < hand.size(); i++) {
				x = Card.toInt(hand.get(i).getRank());
				sum += x; 
			}
		}	
		
		return sum;
	}
	
	public static int handTotal(ArrayList<Card> hand) {
		int sum = 0;
		int x; 
		int aces;
//		while(hasAce(hand) == true && sum < 21)
//			Card.Value.ACE = Card.Value.BIGACE;
//		//if sum is > 21 BigAce = Ace
//		if(hasAce(hand) == true && sum < 21) {
//			Value.ACE = Value.BIGACE;
//		}
		while(Hand.hasAce(hand) == true && sum < 21) {
//			Value.ACE = Value.BIGACE;
			//Change card not value of card or enum
		}
		return 0;
	}
	
	public void resetHand() {
		hand.clear();;
		
	}
	
	public static boolean hasAce(ArrayList<Card> hand) {
		
		if(hand.contains(Card.Value.ACE)) {
			return true;
		}
		return false;
	}
	
	public void handResults() throws Exception {
		FileWriter out = new FileWriter("resultOfHands.txt", true);
		Scanner in = new Scanner(System.in);
		System.out.println("Play again?");
		out.write("Play Again?");
		String answer = in.next();
		out.write(answer);
		//write out what hands were
		//localDateTimeNow()
	}
	

}
