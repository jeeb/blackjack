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
    
    /*
     * Java enums with values omnomnomnom
     */
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
    private boolean isconcealed;

    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
        this.isconcealed = false;
    }

    public Card(Suit suit, Rank rank, boolean isconcealed) {
        this.isconcealed = isconcealed;
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

    public boolean isConcealed() {
        return isconcealed;
    }

    public void setConcealment(boolean concealment) {
        this.isconcealed = concealment;
    }

    @Override
    public String toString() {
        if( this.isconcealed )
            //return rank + " of " + suit + ", is concealed.";
            return "concealed card";
        else
            return rank + " of " + suit;
    }
}
