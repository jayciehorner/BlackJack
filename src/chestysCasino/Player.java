package chestysCasino;

public class Player extends Person{
	
	private String name;
	//email or id  ??? serializable
	private int bet;
	private int bank;
	private Hand hand;
	private int deposit; 
	
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
		//pulls one card 
		//so deck.next();
		bet = 0;
	}
	
	public void insurance() {
		//dealer showing ace 
		//pays 2/1
		//half players bet
		//new bet?
	}

}
