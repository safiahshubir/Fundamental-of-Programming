/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L8Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in =  new Scanner(System.in);
        Fraction frac = new Fraction();
        
        System.out.print("Numerator = ");
        frac.setNumerator(in);
        System.out.print("Denominator = ");
        frac.setDenominator(in);
        System.out.println("");
        System.out.println(frac.getNumerator()+"/"+frac.getDenominator()+"\n");
        System.out.print("Reduced fraction = ");
        frac.simplest();
    }
    
}