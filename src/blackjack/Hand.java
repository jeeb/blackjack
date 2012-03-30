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
        /*
         * Count the amount of points per hand here.
         * NO MORE ZERO SIRE NO MORE.
         */
        
        int currentpoints = 0;
        
        for ( Card cards : hand ) {
            switch(cards.rank()) {
                /*
                 * Brainfart switch statement.
                 * Blame the fact that I couldn't get DEUCE(2) etc. done
                 * in Card.java
                 */
                case DEUCE: currentpoints =+ 2;
                case THREE: currentpoints =+ 3;
                
            }
        }
        return 0;
    }
    
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
