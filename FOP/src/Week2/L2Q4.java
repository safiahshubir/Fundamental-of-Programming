/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L2Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
 
      System.out.print("Enter the number of seconds: ");
      int input = s.nextInt();
 
      int hours = input / 3600;
      int minutes = (input % 3600) / 60;
      int seconds = (input % 3600) % 60;
 
      System.out.println("Hours: " + hours);
      System.out.println("Minutes: " + minutes);
      System.out.println("Seconds: " + seconds);
    }
    
}
