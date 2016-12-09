package cards;

public abstract class Card {
	private boolean available = true;
	
	protected int faceValue;
	protected Suit suit;
	
	public Card(int val, Suit s){
		this.faceValue = val;
		this.suit = s;
	}

	public boolean isAvailable() {
		return available;
	}
	
	public void makeAvailable(){
		this.available = true;
	}
	
	public void makeUnavailable(){
		this.available = false;
	}
	
	public int getFaceValue() {
		return faceValue;
	}

	public Suit getSuit() {
		return suit;
	}
}
