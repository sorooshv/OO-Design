package cards;

import java.util.ArrayList;
import java.util.Random;

public class Deck <T extends Card> {
	public ArrayList<T> cards; //ALL CARDS
	private int dealtIndex = 0; 
	
	public void setDeckOfCards(ArrayList<T> deckOfCards){
		this.cards = deckOfCards;
	}
	
	public void shuffle(){
		ArrayList<T> temp = new ArrayList<T>();
		Random rand = new Random();
		while(cards.size() > 0){
			int index = rand.nextInt(cards.size());
			temp.add(cards.get(index));
			cards.remove(index);
		}
		cards = temp;
	}
	
	public int remainingCards(){
		return cards.size() - dealtIndex;
	}
	
	public Hand<T> dealHand(int number){
		Hand<T> hand = new Hand<T>();
		for(int i = 0 ; i< number ; i++){
			hand.addCard(cards.get(dealtIndex));
			dealtIndex++;
		}
		return hand;
	}
	
	public T dealCard(){
		return null;
	}
	
	
}
