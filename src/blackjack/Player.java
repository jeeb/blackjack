/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package blackjack;

/**
 *
 * @author jeekstro
 */
public class Player {
    private int money;
    private Hand hand;
    
    public Player() {
        this.money = 25;
        hand = new Hand();
    }
    
    public int getMoney() {
        return money;
    }
    
    public void drawCard(Deck deck) {
        hand.addCard(deck);
    }
    
    public void addMoney(int amount) {
        money += amount;
    }
    
    public void removeMoney(int amount) {
        money -= amount;
    }
    
    @Override
    public String toString() {
        return "Player has " + money + " money and a hand of " + hand + " cards, " + hand.countPoints( 0 ) + " points.";
    }
}
