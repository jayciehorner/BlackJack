package chestysCasino;

public class Person {
	
	//dealer is-a person
	//player is-a person
	
	//person has-a hand
	//each hand has a hit stay ... methods 
	
	private String name;
	private Hand hand;
	
	
	public Person() {
		
	}
	
	public Person(String name, Hand hand) {
		this.name = name;
		this.hand = new Hand();
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Hand getHand() {
		return hand;
	}
	public void setHand(Hand hand) {
		this.hand = hand;
	}
	
//	public void hit() {
//		
//	}
//	
//	public void stay() {
//		
//	}
//	
//	public void push() {
//		
//	}
	

}
