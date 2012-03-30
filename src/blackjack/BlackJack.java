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

public class BlackJack {

    private static Scanner reader = new Scanner(System.in);
    
    private static boolean checkInt() {
        if ( reader.hasNextInt() ) {
            if( reader.nextInt() == 1 )
                return true;
            else
                return false;
        } else
            return false;
    }
    
    private static void startGame() {
        int selection = 1;
        boolean trainwreck = false; // set 'first pass is gone' to false
        
        Deck demodeck = new Deck();
        
        System.out.println("\n\nCards being shuffled...");
        
        Player player = new Player("DemoPlayer");
        Player dealer = new Player("DealerPlayer", true);
        
        System.out.println("\nNew players created.");
        
        // I hate goto but here it seems like raptors might work.
        gameplay:
        
        
        System.out.println("\nCards dealt for the player.");
        player.drawCard(demodeck);
        player.drawCard(demodeck);
        System.out.println(player);
        
        if( dealer.getPoints() > 21 ){
            System.out.println("Unfortunate Match Over: You lose 20 monetary units.");
            player.removeMoney(20);
            
            demodeck.resetDeck();
            player.clearHand();
            dealer.clearHand();
            
            if(player.getMoney() <= 0){
                System.out.println("You have run out of money, Full Game Over.");
            }
        }
        
        /*
        System.out.println("\nCards dealt for the dealer.");
        dealer.drawCard(demodeck);
        dealer.drawConcealedCard(demodeck);
        System.out.println(dealer);
        
        
        
        System.out.println("How do you play?");
        System.out.println(" [1]  J-j-j-jam it in!");
        System.out.println(" [2]  Stop here.");
        System.out.println(" [3]  Genuflect.");
        System.out.println("[ANY] EXIT");
        
        if ( reader.hasNextInt() ) {
            selection = reader.nextInt();
            if ( selection == 1 ) {
                System.out.println("Dealer unconceals his second card...");
                dealer.unConcealCards();
                System.out.println(dealer);
                
                if ( dealer.getPoints() > 21 ){
                    System.out.print("Dealer's Game Over, you get 20 monetary units.");
                    player.addMoney(20);
                }
                
                if( dealer.getPoints() == 21 ){
                    System.out.println("Dealer's Black Jack. You lose 20 monetary units.");
                    player.removeMoney(20);
                }
                
                player.drawCard(demodeck);
                System.out.println(player);
                
                if()
            } else if( selection == 2 ) {
                System.out.println("Dealer unconceals his second card...");
                dealer.unConcealCards();
                System.out.println(dealer);
            } else {
                System.out.println("Genuflecting in peace.");
                return;
            }
        }
         * 
         */
        
        return;
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public static void main(String args[]) {
        int selection;
        boolean check;
        
        beginning:
        
        System.out.println("Blackjack demo:\n");
        System.out.println("  [1]  New Game");
        System.out.println(" [ANY] Exit Game");
        
        
        if ( checkInt() ){
            startGame();
            return;
        } else {
            System.out.println("And so we exit peacefully.");
        }
    }
}
