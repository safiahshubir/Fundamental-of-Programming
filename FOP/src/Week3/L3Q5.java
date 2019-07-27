/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;



/**
 *
 * @author vadmin
 */
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       int x,y;
        Scanner sc=new Scanner(System.in);
        System.out.print(" Enter number for a: ");
        int a=sc.nextInt();
        System.out.print(" Enter number for b: ");
        int b=sc.nextInt();
        System.out.print(" Enter number for c: ");
        int c=sc.nextInt();
        System.out.print(" Enter number for d: ");
        int d=sc.nextInt();
        System.out.print(" Enter number for e: ");
        int e=sc.nextInt();
        System.out.print(" Enter number for f: ");
        int f=sc.nextInt();
        
        if ((a*d-b*c)==0)
            System.out.println("The equation has no solution.");
        else{
             x = (e*d-b*f)/(a*d-b*c);
             y = (a*f-e*c)/(a*d-b*c);
             System.out.println(x);
             System.out.println(y);
        }
        }
        
       
    }
    
