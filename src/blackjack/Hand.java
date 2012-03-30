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
    
    public int countPoints(int game_mode) {
        int currentpoints = 0;
        
        /*
         * Count non-aces first
         */
        
        for ( Card i : hand ) {
            switch(i.rank()) {
                case ACE:
                    continue;
                default:
                    currentpoints += i.getValue();
            }
        }
        
        /*
         * Then count aces
         */
        
        for ( Card currentcard : hand ) {
            switch(currentcard.rank()) {
                case ACE:
                    if ( currentpoints > 10 )
                        currentpoints += 1;
                    else
                        currentpoints += currentcard.getValue();
                default:
                    continue;
            }
        }
        return currentpoints;
    }
    
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
