import java.util.*;

public class Player {
	
	private List<Card> hand;
	private int score;
	private String name;
	
	public Player(String name) {
		hand = new ArrayList<>();
		score = 0;
		this.name = name;
	}
	
	public void describe() {
		System.out.println("Name: " + name);
		System.out.println("Score: " + score);
		System.out.println("Hand:");
		for (Card card : hand) {
			card.describe();
		}
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore() {
		return score;
	}
}
