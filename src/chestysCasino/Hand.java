package chestysCasino;

public class Hand { 
	
	private Card[] myHand= new Card[10];
	
	private int cards;
	private int value;
	
	public Hand() {
		//collection of cards
	}
	
	
	public void hit() {
		
		//add deck.next();  ???
		// getRandom() or pullRandom in deck class
	}
	
	public void stay() {
		// move to next hand in order
	}
	
	public void split() {
		// create new hand[] with each card
		// if cards at index 0 and 1 == new card[]
	}

	public int getCards() {//do we need net next for random card
		return cards;
	}
	
	public int calculateTotalHandValue() {
		//acecheck
		//card.getValue
		
		return value;
	}
	
	public void resetHand() {
		cards = 0;
	}
	
//	public void doubleDown() {
//		bet *= 2;
//	}
	//doubleDown bet *=2; here or in 

	public Hand(int cards) {
		super();
		this.cards = cards;
	}
	
	
	
	

}
