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
    
    public void addConcealedCard(Deck deck) {
        hand.add(deck.deal(true));
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
            if (i.isConcealed()) {
                continue;
            } else {
                switch(i.rank()) {
                    case ACE:
                        continue;
                    default:
                        currentpoints += i.getValue();
                }
            }
        }
        
        /*
         * Then count aces
         */
        
        for ( Card currentcard : hand ) {
            if( currentcard.isConcealed() ) {
                continue;
            } else {
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
       }
       return currentpoints;     
    }
    
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
