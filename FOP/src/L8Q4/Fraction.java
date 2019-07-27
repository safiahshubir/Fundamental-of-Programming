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
public class Fraction {
    private int numerator;
    private int denominator;
    
    public Fraction(){
        
    }
    
    public void setNumerator(Scanner in){
        numerator = in.nextInt();
    }
    public void setDenominator(Scanner in){
        denominator = in.nextInt();
    }
    public int getNumerator(){
        return numerator;
    }
    public int getDenominator(){
        return denominator;
    }
    public void simplest(){
        int a = numerator;
        int b = denominator;
                
        while(b!=0){
            int temp = b;
            b = a%b;
            a = temp;    
        }
        numerator = numerator/a;
        denominator = denominator/a;
        
        System.out.printf("%d/%d",numerator,denominator);
        System.out.println("");
    }
    
    /*
    public int egcd(int a, int b) {
        if (a == 0)
            return b;
        while (b != 0) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
    */
}