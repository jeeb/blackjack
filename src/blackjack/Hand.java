/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;

import java.util.*;

/**
 *
 * @author jeekstro
 */
public class Hand {
    private ArrayList<Card> hand;
    
    
    public Hand() {
        hand = new ArrayList<Card>();
        
    }
    
    public void addCard(Card herp) {
        hand.add(herp);
    }
    
    public void addCard(Deck deck) {
        hand.add(deck.deal());
    }
    
    public Card getCard(int derp) {
        return hand.get(derp);
    }
    
    public int countAll() {
        /*
         * Count the amount of points per hand here.
         * TEMPORARY ZERO.
         */
        return 0;
    }
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
