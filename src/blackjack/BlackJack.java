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
        
        
        // Testing deck's inner workings
        Deck testdeck = new Deck();
        System.out.println(testdeck.toString());
        
        Card testcard2 = testdeck.deal();
        System.out.println(testcard2.toString());
        
        Card testcard3 = testdeck.deal();
        System.out.println(testcard3.toString());
        System.out.println(testcard3.getValue());
        
        // Testing hand's inner workings
        Hand testhand = new Hand();
        System.out.println(testhand.toString());
        
        testhand.addCard(testdeck.deal());
        System.out.println(testhand.toString());
        
        /* 
         * Now we can add cards via a
         * deck with just telling it what deck to use :D
         */
        
        testhand.addCard(testdeck);
        System.out.println(testhand.toString());
        
        System.out.println(testhand.countPoints(0));
        
    }
}
