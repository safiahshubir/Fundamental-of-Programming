/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L6Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //unknown if the method fulfills the question requirement
        Random rand = new Random();
        Scanner in = new Scanner(System.in);

        int k = 0, score = 0;
        
        while(k >= 0){
            int i = rand.nextInt(21)+30;
            int j = rand.nextInt(21)+30;
            
         
            System.out.println("Enter negative number to quit.");
            System.out.print(i+" X "+j+ " = ");
            k = in.nextInt();
            if(k<0){
                break;
            }
            if(k == i*j){
                score++;
            }
            getNum(k);
        }
        System.out.println("Your Score is " + score);
    }
    //not confirmed
    public static int getNum(int c){
      
        return c;
    }
    
}