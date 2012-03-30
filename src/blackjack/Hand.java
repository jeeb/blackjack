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
    
    public int countPoints(int game_stage) {
        
        int currentpoints = 0;
        
        for ( Card cards : hand ) {
            switch(cards.rank()) {
                default:
                    currentpoints =+ cards.getValue();
                case ACE:
                    if ( currentpoints > 10 )
                        currentpoints =+ 1;
                    else
                        currentpoints =+ cards.getValue();
            }
        }
        return currentpoints;
    }
    
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
