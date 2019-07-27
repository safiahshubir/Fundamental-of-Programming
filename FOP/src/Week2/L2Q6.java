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
public class L2Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner s=new Scanner(System.in);
                float a,b,c,d,e,M,Q;
                
          System.out.print("Enter amount of water in gram: ");
          e=s.nextFloat();
          M=(float) (e*0.001);
          
          System.out.print("Enter initial temperature in degree Fahrenheit:");
          a=s.nextFloat();
          b=(float) ((a-32)/1.8);
          
          System.out.print("Enter final temperature in degree Fahrenheit:");
          c=s.nextFloat();
          d=(float) ((c-32)/1.8);
          
          Q = M * (d-b) * 4184;
          System.out.println("The energy needed to heat water: " + Q + " Joules.");
          
          
    }
    
}
