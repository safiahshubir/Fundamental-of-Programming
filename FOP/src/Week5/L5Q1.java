/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author WIC170074
 */
public class L5Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      
        
        Random rand=new Random();
        
        Scanner sc=new Scanner(System.in);
        
        System.out.print("Enter N student : ");
        int N=sc.nextInt();
        System.out.println(""); 
        int num[] = new int[N];
        
             int max=-1, min=101,sum=0;
             
        for(int k=0;k<N;k++){
           num[k]=rand.nextInt(101); 
  
            if(num[k]<min)
                min=num[k];
            if(num[k]>max)
                max=num[k];
        
        sum = sum + num[k];
                System.out.println(num[k]);
        }
        
        float ave = (float)sum/N;
        System.out.println();
        System.out.println("Highest score: " + max);
        System.out.println("Lowest score: " + min);
        System.out.print("Average score: ");
        System.out.printf("%.2f\n",ave);
    }
    
    }


