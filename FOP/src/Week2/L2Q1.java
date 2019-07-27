/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Scanner;

/**
 *
 * @author WIC170074
 */
public class L2Q1 {
    public static void main(String[] args){
         
        Scanner s=new Scanner(System.in);
                float a,b ;
          System.out.print("Enter temperature in degree Fahrenheit:");
          a=s.nextFloat();
          b=(float) ((a-32)/1.8);
          System.out.printf("Temperature in degree Celcius:"+ "%6.2f", b);
         
          
          
    }
    
}
