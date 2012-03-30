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

    public enum Suit {

        CLUBS, DIAMONDS, HEARTS, SPADES
    }

    public enum Rank {

        DEUCE(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8),
        NINE(9), TEN(10), JACK(10), QUEEN(10), KING(10), ACE(11);
                
        private final int val;
        
        Rank(int val) {
            this.val = val;
        }
    }
    private final Suit suit;
    private final Rank rank;
    private boolean isConcealed;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Rank rank() {
        return rank;
    }

    public Suit suit() {
        return suit;
    }
    
    public int getValue() {
        return rank.val;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
