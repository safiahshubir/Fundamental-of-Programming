/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L4Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int n=sc.nextInt();
        int total = 0,sum = 0;
 
       for(int i=1; i<=n; i++)
     {
       total+=i;
       sum+=total;
        }
 
  System.out.println(sum);
    }
    }
    

