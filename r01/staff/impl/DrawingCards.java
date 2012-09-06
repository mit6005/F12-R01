package staff.impl;
import java.util.Arrays;


public class DrawingCards {

    public static void main(String[] args) {
        String[] ranks = {"Ace", "King", "Queen"};
        String[] suits = {"Spades", "Diamonds"};
        
        System.out.println("Drawing With Replacement:");
        String[] replacedCards = printFiveCardsWithReplacement(ranks, suits);
        System.out.println(Arrays.toString(replacedCards));
        System.out.println();
        
        System.out.println("Drawing Without Replacement:");
        String[] notReplacedCards = printFiveCardsWithoutReplacement(ranks, suits);
        System.out.println(Arrays.toString(notReplacedCards));
    }
    
    /**
     * Prints a readable String of the inputted card.
     * 
     * @param rank String for the rank of the card.
     * @param suit String for the suit of the card.
     * @return String of the form "$rank of $suit"
     */
    public static String getCardString(String rank, String suit) {
        return rank + " of " + suit;
    }
    
    /**
     * Draw 5 random cards with replacement from inputted card parameters.
     * 
     * @param ranks String Array for ranks to draw from
     * @param suits String Array for suits to draw from
     * @return String Array containing 5 randomly drawn cards (with replacement)
     */
    static String[] printFiveCardsWithReplacement(String[] ranks, String[] suits) {
        String[] cards = new String[5];
        for (int i=0; i<5; i++) {
            int randomRank = (int) (Math.random() * ranks.length);
            int randomSuit = (int) (Math.random() * suits.length);
            cards[i] = getCardString(ranks[randomRank], suits[randomSuit]);
        }
        return cards;
    }
    

    /**
     * Draw 5 random cards without replacement from inputted card parameters.
     * 
     * @param ranks String Array for ranks to draw from
     * @param suits String Array for suits to draw from
     * @return String Array containing 5 randomly drawn cards (without replacement)
     */
    static String[] printFiveCardsWithoutReplacement(String[] ranks, String[] suits) {
        // Enumerate all the cards.
        int cardsCount = ranks.length * suits.length;
        String[] cards = new String[cardsCount];
        int i=0;
        for (String rank : ranks) {
            for (String suit : suits) {
                cards[i++] = getCardString(rank, suit);
            }
        }
        
        // Generate a random permutation of the cards (shuffle the cards).
        String[] dealt = new String[5];
        for (i=0; i<5; i++) {
            int randomCardIndex = i + (int) (Math.random() * (cardsCount - i));
            String temp = cards[i];
            cards[i] = cards[randomCardIndex];
            cards[randomCardIndex] = temp;
            
            dealt[i] = cards[i];
        }
        return dealt;
    }
}
