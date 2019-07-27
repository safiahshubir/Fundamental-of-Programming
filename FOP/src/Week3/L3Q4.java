/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Random;

/**
 *
 * @author WIC170074
 */
public class L3Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String player1 = "Player 1", player2 = "Player 2";
        Random r = new Random();         
        final int MAX=6;
        int dice, totalP1=0, totalP2=0;
        for(int j=1; j<3; j++){
        int i=1;
        while (true) {
           dice = r.nextInt(MAX)+ 1;
          
           if (i%2==1) {
               totalP1+=dice;
               System.out.println(player1 + " " + dice + " Total :" + totalP1);        
           }
           else {
               totalP2+=dice;
               System.out.println(player2 + " " + dice + " Total :" + totalP2);        
           
           }
           i++;
          
           if (totalP1>totalP2) {
               System.out.println(player1 + " wins the game!");
               break;
           }    
           else if (totalP2>totalP1) {
               System.out.println(player2 + " wins the game!");
               break;
           }
        }
        
        
        
        
        
        
    }
}
}