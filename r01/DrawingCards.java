import java.util.Arrays;

class DrawingCards {
    public static void main(String[] args) {
        String[] ranks = {"Ace", "King", "Queen"};
        String[] suits = {"Spades", "Diamonds"};
        
        System.out.println("Drawing with Replacement:");
        String[] replacedCards = printFiveCardsWithReplacement(ranks, suits);
        System.out.println(Arrays.toString(replacedCards));
        System.out.println();
        
        System.out.println("Drawing without Replacement:");
        String[] notReplacedCards = printFiveCardsWithoutReplacement(ranks, suits);
        System.out.println(Arrays.toString(notReplacedCards));
    }
    
    /**
     * Prints a readable String of the inputted card.
     *  Ex. getCardString("Ace", "Spades") -> "Ace of Spades"
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
     *  Ex. printFiveCardsWithReplacement( {"Ace", "King", "Queen"} ,
     *                                     {"Spades", "Diamonds"} )
     *      may yield { "Ace of Spades", 
     *                  "Ace of Spades", 
     *                  "Ace of Diamonds", 
     *                  "Queen of Spades", 
     *                  "Queen of Spades" }
     *      there may potentially be repeating cards within this array.
     * 
     * @param ranks String Array for ranks to draw from
     * @param suits String Array for suits to draw from
     * @return String Array containing 5 randomly drawn cards (with replacement)
     */
    static String[] printFiveCardsWithReplacement(String[] ranks, String[] suits) {
        // TODO Complete this implementation!
        // You can use "Math.random()" to generate a random double between 0 and 1.
        throw new RuntimeException("printFiveCardsWithReplacement has not been implemented!");
    }
    
    /**
     * Draw 5 random cards without replacement from inputted card parameters.
     *  Ex. printFiveCardsWithoutReplacement( {"Ace", "King", "Queen"} ,
     *                                        {"Spades", "Diamonds"} )
     *      may yield { "Ace of Spades", 
     *                  "King of Spades", 
     *                  "Ace of Diamonds", 
     *                  "Queen of Diamonds", 
     *                  "Queen of Spades" }
     *      but no repeating cards within this array.
     * 
     * @param ranks String Array for ranks to draw from
     * @param suits String Array for suits to draw from
     * @return String Array containing 5 randomly drawn cards (without replacement)
     */
    static String[] printFiveCardsWithoutReplacement(String[] ranks, String[] suits) {
        // TODO Complete this implementation!
        throw new RuntimeException("printFiveCardsWithoutReplacement has not been implemented!");
    }
}