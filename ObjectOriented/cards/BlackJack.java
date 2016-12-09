package cards;

import java.util.ArrayList;
import java.util.Arrays;

public class BlackJack {
	private Deck<BlackJackCard> deck;
	
	public BlackJack(){
		deck.setDeckOfCards(createNewDeck());
	}
	public void shuffle(){
		deck.shuffle();
	}
	public void print(){
		System.out.println(Arrays.toString(deck.cards.toArray()));
	}
	
	
	private ArrayList<BlackJackCard> createNewDeck() {
		ArrayList<BlackJackCard> cards = new ArrayList<BlackJackCard>();
		
		for(int i=1 ; i <= 13 ; i++){
			cards.add(new BlackJackCard(i, Suit.Club));
		}
		
		for(int i=1 ; i <= 13 ; i++){
			cards.add(new BlackJackCard(i, Suit.Diamond));
		}
		
		for(int i=1 ; i <= 13 ; i++){
			cards.add(new BlackJackCard(i, Suit.Heart));
		}
		
		for(int i=1 ; i <= 13 ; i++){
			cards.add(new BlackJackCard(i, Suit.Spade));
		}
		return cards; 
	}
}
