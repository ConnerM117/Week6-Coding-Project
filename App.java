
public class App {

	public static void main(String[] args) {
		
		Deck deck = new Deck(); //instantiate the deck
		deck.shuffle(); //shuffle the deck
		Player player1 = new Player("Player 1"); //instantiate player 1
		Player player2 = new Player("Player 2"); //instantiate player 2
		
		for (int i = 1; i <= 52; i++) { //using a for loop that iterates 52 times (this bothers me because it would be more efficient to iterate 26 times and have both draw each time but whatever)
			if (i % 2 == 0) {
				player1.draw(deck); //if the number is even, player 1 draws
			} else {
				player2.draw(deck); //if the number is odd, player 2 draws
			}
		}
		
		for (int i = 0; i < 26; i++) { //using a for loop that iterates 26 times
			Card p1 = player1.flip(); //both players flip
			Card p2 = player2.flip();
			System.out.println("Player 1 shows a " + p1.getName());
			System.out.println("Player 2 shows a " + p2.getName());
			
			if (p1.getValue() > p2.getValue()) { //if player 1's card is bigger
				player1.incrementScore(); //player 1's score increments
				System.out.println("Player 1 gets the point!");
			} else if (p2.getValue() > p1.getValue()) { //if player 2's card is bigger
				player2.incrementScore(); //player 2's score increments
				System.out.println("Player 2 gets the point!");
			} else { //otherwise it's a draw
				System.out.println("It's a draw!");
			}
			System.out.println("Scores:");
			System.out.println("Player 1: " + player1.getScore());
			System.out.println("Player 2: " + player2.getScore());
			System.out.println(""); //space out each round for readability
		}
		
		if (player1.getScore() > player2.getScore()) {
			System.out.println("Player 1 Wins!");
		} else if (player2.getScore() > player1.getScore()) {
			System.out.println("Player 2 Wins!");
		} else {
			System.out.println("The game is a draw!");
		}

	}

}
