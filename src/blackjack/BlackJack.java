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

    /**
     * @param args the command line arguments
     */
    private static Scanner reader = new Scanner(System.in);
    
    public static boolean checkInt() {
        if ( reader.hasNextInt() ) {
            if( reader.nextInt() == 1 )
                return true;
            else
                return false;
        } else
            return false;
    }
    
    public static void main(String args[]) {
        int selection;
        boolean check;
        
        
        System.out.println("Blackjack demo:\n");
        System.out.println("  [1]  New Game");
        System.out.println(" [ANY] Exit Game");
        
        
        if ( checkInt() ){
            
        } else {
            System.out.println("And so we exit peacefully");
        }
    }
}
