import java.util.*;

public class Deck {
	
	private List<Card> cards;
	
	public Deck() {
		cards = new ArrayList<>();

		for (int i = 0; i < 4; i++) {
			for (int j = 2; j <= 14; j++) {
				String tempName = "";
				switch (j) {
				case 2: tempName += "Two"; break;
				case 3: tempName += "Three"; break;
				case 4: tempName += "Four"; break;
				case 5: tempName += "Five"; break;
				case 6: tempName += "Six"; break;
				case 7: tempName += "Seven"; break;
				case 8: tempName += "Eight"; break;
				case 9: tempName += "Nine"; break;
				case 10: tempName += "Ten"; break;
				case 11: tempName += "Jack"; break;
				case 12: tempName += "Queen"; break;
				case 13: tempName += "King"; break;
				case 14: tempName += "Ace"; break;
				}
				switch (i) {
				case 0: tempName += " of Hearts"; break;
				case 1: tempName += " of Diamonds"; break;
				case 2: tempName += " of Clubs"; break;
				case 3: tempName += " of Spades"; break;
				}
				cards.add(new Card(j, tempName));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(cards);
	}
	
	public Card draw() {
		return cards.remove(0);
	}

}
