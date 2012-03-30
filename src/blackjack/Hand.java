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
    
    @Override
    public String toString() {
       return ""+hand.size(); 
    }
    
}
