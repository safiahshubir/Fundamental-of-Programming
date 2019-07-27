/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week4;

import java.util.Random;

/**
 *
 * @author WIC170074
 */
public class L4Q8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n,i=1,count=0;
        Random ran=new Random();
        n= ran.nextInt(101);
        System.out.println("The random number is: " + n);
        do{
        if((i==2)||(i==3)||(i==5)||(i==7)||(i%2!=0)&&(i%3!=0)&&(i%5!=0)&&(i%7!=0)&&(i!=1)) {
            System.out.print(i+" ");
            count++;
        }
        i++;
    }
        while(count<n);
    
    }
}
