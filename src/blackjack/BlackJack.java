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

public class BlackJack {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Testataan korttiluokan toimivuutta. Käpistellään.
        Card testcard = new Card(Card.Suit.DIAMONDS, Card.Rank.DEUCE);
        System.out.println(testcard.toString());
        
        Deck testdeck = new Deck();
        System.out.println(testdeck.toString());
    }
}
