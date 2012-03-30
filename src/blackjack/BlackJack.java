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
        
        System.out.println("Original testing stuff:\n");
        
        Card testcard = new Card(Card.Suit.DIAMONDS, Card.Rank.DEUCE);
        System.out.println(testcard.toString());
        
        
        // Testing deck's inner workings
        
        System.out.println("*******************\n\nDeck testing:\n");
        
        Deck testdeck = new Deck();
        System.out.println(testdeck.toString());
        
        Card testcard2 = testdeck.deal();
        System.out.println(testcard2.toString());
        
        Card testcard3 = testdeck.deal();
        System.out.println(testcard3.toString());
        System.out.println(testcard3.getValue());
        
        // Testing hand's inner workings
        System.out.println("*******************\n\nHand testing:\n");
        
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
        
        /*
         * Player testing
         */
        
        System.out.println("*******************\n\nPlayer testing:\n");
        
        Deck testdeck2 = new Deck();
        
        Player player = new Player("TestPlayer");
        Player dealer = new Player("Marko", true);
        
        player.drawCard(testdeck2);
        player.drawCard(testdeck2);
        System.out.println(player);
        
        dealer.drawCard(testdeck2);
        dealer.drawConcealedCard(testdeck2);
        System.out.println(dealer);
        
        
    }
}
