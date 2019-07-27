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
public class L2Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        float M, P, D, R, Y ;
        System.out.print("The price of the car : RM ");
        P= s.nextFloat();
        System.out.print(" Down payment : RM ");
        D=s.nextFloat();
        System.out.print("Interest Rate in % : ");
        R=s.nextFloat();
        System.out.print("Loan duration in year : ");
        Y=s.nextFloat();
        M=(P-D)*(1+R*Y/100)/(Y*12);
        System.out.printf("Monthly Payment : RM" + "%6.2f",M);
    }
    
}
