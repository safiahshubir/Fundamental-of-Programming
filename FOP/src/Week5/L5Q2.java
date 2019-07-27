/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.util.Random;

/**
 *
 * @author user
 */
public class L5Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rand = new Random();        
        int number[] = new int[10];
        
        number[0] = rand.nextInt(21);
        System.out.println(number[0]);
        
        for(int i = 1; i<10; i++){
            number[i] = rand.nextInt(21);
            for(int c = 1; c<=i; c++){
                if(number[i] == number[i-c]){
                    i--;
                    break;
                }                        
                else if (number[i] != number[i-c] && c == i)
                    System.out.println(number[i]);                                        
            }             
        }
    }
    
}