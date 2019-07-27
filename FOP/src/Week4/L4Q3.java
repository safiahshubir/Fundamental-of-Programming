/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Scanner;

/**
 *
 * @author WIC170074
 */
public class L4Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner num=new Scanner(System.in);
        int a,min;
        do{
        System.out.print("Enter a score (negative score to quit): ");
        a=num.nextInt();
            
       min=a;
            if(a<min)
                min=a;
              
          
        }
        while(!(a<0));
        System.out.println(a);
  System.out.println("Minimum: "+ min);
  
        
        
        
    
}
}