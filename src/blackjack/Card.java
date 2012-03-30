/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;

/**
 *
 * @author jeekstro
 */
import java.util.*;

public class Card {
    public enum Suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    public enum Rank { DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
                        TEN, JACK, QUEEN, KING, ACE }
    
    private final Rank rank;
    private final Suit suit;
    
    /*
     * Changing ints to enums
     * private int suit;
     * private int rank;
    */
    private boolean isConcealed;
    
    private Card(Rank rank, Suit suit){
         this.rank = rank;
         this.suit = suit;
    }
    
    public Rank rank() {
        return rank;
    }
    public Suit suit() {
        return suit;
    }
    
    private static final List<Card> protoDeck = new ArrayList<Card>();
    
    // initialize protodeck
    static {
        for(Suit suit : Suit.values())
            for(Rank rank : Rank.values())
                protoDeck.add(new Card(rank, suit));
    }
    
    public static ArrayList<Card> newDeck() {
        return new ArrayList<Card>(protoDeck);
    }
}
