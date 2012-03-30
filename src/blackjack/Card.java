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
    
    private final Suit suit;
    private final Rank rank;
    
    /*
     * Changing ints to enums
     * private int suit;
     * private int rank;
    */
    private boolean isConcealed;
    
    private Card(Suit suit, Rank rank) {
       this.suit = suit;
       this.rank = rank;
    }
    
    
}
