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
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Radius : ");
        int rad=sc.nextInt();
        System.out.print("Enter  a coordinate point (x,y) : ");
        int x=sc.nextInt();
        int y=sc.nextInt();
         int x1=0,y1=0;
         
        if ((x - x1)*(x - x1) + (y - y1)*(y - y1) <= rad*rad)
            System.out.println("inside");
        else
            System.out.println("outside");
    }
    
}
