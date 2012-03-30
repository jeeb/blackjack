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

public class Deck {
    final static int DECK_SIZE = 52;
    public int cards_left;
    public ArrayList<Card> deck;
    
    public Deck() {
        cards_left = DECK_SIZE;
        ArrayList<Card> deck = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
        cards_left = deck.size();
        System.out.println(""+deck.size());
    }
    
    public String toString() {
        return ""+cards_left;
    }
    /*
    public String toString() {
        return "Herp derp";
    }
    * 
    */
}
