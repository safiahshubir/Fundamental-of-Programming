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
public class L6Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Scanner sc  = new Scanner(System.in);
        Random rand = new Random();
        int rev[] = new int[10];
        System.out.println("10 integers to be reversed");
         for(int i = 0; i < 10; i++){
            rev[i] = rand.nextInt(1001);
          
                System.out.print(rev[i]+ " ");
         }
        System.out.println("\nReversed integers");
        for(int i = 0; i < rev.length; i++){
           
                System.out.print(revArr(rev[i])+" ");
                  
    }
    }
    public static int revArr(int x){     
            int revNum = 0;
            while(x != 0){
                revNum = revNum*10 + (x%10);
                x = x/10;
            }
        return revNum; //return reversed number
    }
}