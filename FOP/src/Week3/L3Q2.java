/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Random;

/**
 *
 * @author WIC170074
 */
public class L3Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int num;
         Random ran=new Random();
         num=ran.nextInt(6);
         switch(num){
             case 0:
             System.out.println(num+" is zero.");
             break;
             case 1:
            System.out.println(num+" is one.");
            break;
             case 2:
            System.out.println(num+" is two.");
            break;
             case 3:
            System.out.println(num+" is three.");
            break;
             case 4:
            System.out.println(num+" is four.");
            break;
             case 5:
            System.out.println(num+" is five.");
            break;
        
    }
    
    }

    }
    

