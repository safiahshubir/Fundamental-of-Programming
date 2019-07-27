/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Random;

/**
 *
 * @author user
 */
public class L4Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Random rand = new Random();
        
        long rnum = rand.nextInt();
        int i = 0;
        
        if (rnum < 0){
            rnum = Math.abs(rnum);
        }//if the integer is negative, the command will convert it to positive
        
        System.out.println("Random integer is " + rnum);
        
        while (rnum > 0){
            rnum = rnum/10;            
            i++; 
        //counter increment to count the digits of the integer
        }
        
        System.out.println("");
        System.out.println("\tThe number of digits in the integer is " + i);
        
    }
    
}