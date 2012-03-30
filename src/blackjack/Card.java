/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;

/**
 *
 * @author jeekstro
 */
public class Card {
    private enum suit { CLUBS, DIAMONDS, HEARTS, SPADES }
    private enum rank { DEUCE, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,
                        TEN, JACK, QUEEN, KING, ACE }
    
    
    /*
     * Changing ints to enums
     * private int suit;
     * private int rank;
    */
    private boolean isConcealed;
    
    public Card() {
         
    }
}
