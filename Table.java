package chestysCasino;

import java.util.ArrayList;

import static chestysCasino.Hand.*;
import static chestysCasino.Card.Value.*;
import static chestysCasino.Card.Suit.*;

public class Table {
	
	public static void main(String[] args) {
//		int x = Card.toInt(Value.EIGHT);
//		System.out.println(x);
		int sum = 0;
		
		ArrayList<Card> d = new ArrayList<>();
		Card c = new Card(CLUBS, ACE);
		Card f = new Card(CLUBS, TWO);
		Card e = new Card(CLUBS, THREE);
		d.add(e);
		d.add(f);
		d.add(c);
		
		
		sum = Hand.calculateTotalHandValue(d);
		System.out.println(sum);
		
		
		
	}

}
