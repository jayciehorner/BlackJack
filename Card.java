package chestysCasino;

public class Card {
	private Suit suit;
	private Value value;
   
	public Card(Suit suit, Value value) {
		this.suit = suit;
		this.value = value;
	}

	public Suit getSuit() {
		return suit;
	}

	public Value getRank() {
		return value;
	}

	public int getValue() {
		return value.ordinal() + 2;
	}
	  public String toString(){
	        return "\n"+ value + " of "+ suit;
	    }

	public enum Suit {
		SPADES, HEARTS, DIAMONDS, CLUBS;
	}

	public enum Value {
		TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, ACE, BIGACE;

	}
	
	public static int toInt(Value x) {
		switch(x) {
		case TWO: return 2;
		case THREE: return 3;
		case FOUR: return 4;
		case FIVE: return 5;
		case SIX: return 6;
		case SEVEN: return 7;
		case EIGHT: return 8;
		case NINE: return 9;
		case TEN: return 10;
		case JACK: return 10;
		case QUEEN: return 10;
		case KING: return 10;
		case ACE: return 1;
		case BIGACE: return 11;
		default: return 0;
		}
	}
	


}