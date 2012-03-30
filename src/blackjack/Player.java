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
    private String name;
    private boolean isdealer;
    private int money;
    private Hand hand;
    
    public Player() {
        this.name = "Default Name";
        this.money = 25;
        hand = new Hand();
    }
    
    public Player(String name) {
        this.isdealer = false;
        this.name = name;
        this.money = 25;
        hand = new Hand();
    }
    
    public Player(boolean isdealer) {
        if (isdealer) {
            this.isdealer = true;
            this.name = "Dealer";
            this.money = 9001;
            hand = new Hand();
        } else
            System.out.println("This thing is supposed to be used when creating dealers! Nothing created.");
    }
    
    public Player(String name, boolean isdealer) {
        if (isdealer) {
            this.isdealer = true;
            this.name = name;
            this.money = 9001;
            hand = new Hand();
        } else
            System.out.println("This thing is supposed to be used when creating dealers! Nothing created.");
    }
    
    public int getMoney() {
        return money;
    }
    
    public void drawCard(Deck deck) {
        hand.addCard(deck);
    }
    
    public void drawConcealedCard(Deck deck) {
        if( this.isdealer ) {
            hand.addConcealedCard(deck);
        } else {
            System.out.println("Herp derp, trying to be faggots here? No card dealt.");
        }       
    }
    
    public void unConcealCards() {
        hand.unConceal();
    }
    
    public void addMoney(int amount) {
        money += amount;
    }
    
    public void removeMoney(int amount) {
        money -= amount;
    }
    
    public boolean isDealer() {
       return this.isdealer; 
    }
    
    @Override
    public String toString() {
        if (this.isdealer)
            return "Player "+name+"[D] has " + money + " money and a hand of " + hand + " cards, " + hand.countPoints( 0 ) + " points.";
        else
            return "Player "+name+" has " + money + " money and a hand of " + hand + " cards, " + hand.countPoints( 0 ) + " points.";
    }
}
