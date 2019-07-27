/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author vadmin
 */
public class L4Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          int Number, i;
       Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer: ");
        Number = sc.nextInt();

      System.out.print("The factors are: ");
        for(i = 1; i <= Number; i++) {
            if(Number%i == 0) { 

                System.out.printf( i + ",");
            
            }

        }
    }
}
    

