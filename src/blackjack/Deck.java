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
    private ArrayList<Card> deck;
    Random generator = new Random();

    public Deck() {
        deck = new ArrayList<Card>();
        for (Card.Suit suit : Card.Suit.values()) {
            for (Card.Rank rank : Card.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public Card deal() {
        System.out.println("Deck size before dealing was: " + deck.size());

        // deal random number between 0 and deck.size()
        int selection = generator.nextInt(deck.size());

        System.out.println("Random generated number was: " + selection);

        /*
         * Return a Card to the using appliance
         * and remove it from the deck. 
         */

        Card randomcard = deck.get(selection);
        deck.remove(selection);

        return randomcard;
    }

    @Override
    public String toString() {
        return "" + deck.size();
    }
}
