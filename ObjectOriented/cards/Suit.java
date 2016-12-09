package cards;

public enum Suit {
	Club(0), Spade(1), Diamond(2), Heart(3);
	
	private int value;
	
	private Suit(int v){
		this.value = v;
	}
	
	public int getValue(){
		return this.value;
	}
	
	public static Suit getSuitFromValue(int val){
		return Suit.values()[val];
	}
}
