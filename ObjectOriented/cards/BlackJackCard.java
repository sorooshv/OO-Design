package cards;

public class BlackJackCard extends Card{
	
	public boolean available;
	public int faceValue;
	public Suit suit;

	public BlackJackCard(int val, Suit s) {
		super(val, s);
		
	}
	
	public int getFaceValue(){
		if(isAce()) return 1;
		else if(isFaceCard()) return 10;
		else
			return faceValue;
	}
	
	public int getMinValue(){
		if(isAce())return 1;
		else 
			return getFaceValue();
	}
	
	public int getMaxValue(){
		if(isAce())return 11;
		else 
			return getFaceValue();
	}
	
	public boolean isAce(){
		return faceValue == 1;
	}
	
	public boolean isFaceCard(){
		return (faceValue <=13 && faceValue >= 11);
	}
}