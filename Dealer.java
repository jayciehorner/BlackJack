package chestysCasino;

import java.util.ArrayList;

public class Dealer extends Person{

	
	Person dealer = new Person();
	
	public void dealerTurn(ArrayList<Card> dealerHand) {
		while(Hand.calculateTotalHandValue(dealerHand) < 17) {
			dealer.getHand().hit(null);;
		}
		
//			if(Hand.calculateTotalHandValue(dealerHand)) >= 17) {
//				dealer.getHand().stay();// then checks all hands vs dealer or is dealer busts all non busts pay
//			}else {}
//		}
	}

	//
	//change to while (dealer.hand < 17) dealer.hit();
	//keep calling until dealer is above 17
	//then check if(
	
//	if (dealer hand < 17) {
//		dealer.hit();
//	}else if (dealer hand >= 17 && dealer hand < 21) {
//		dealer.stay();
//	}else if (dealer hand > 21)
//		dealer.bust();

}
