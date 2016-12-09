package cards;


public class BlackJackHand extends Hand<BlackJackCard>{
	
	public boolean busted(){
		return score() > 21;
	}
	
	public boolean is21(){
		return score() == 21;
	}
	
	public boolean isBlackJack(){
		return (score() == 21 && cards.size() == 2);
	}
	
	public int score(){
		int max = 0;
		int min = 0;
		for(BlackJackCard card : cards){
			max += card.getMaxValue();
			min += card.getMinValue();
		}
		return max > 21? min : max;
	}
}
