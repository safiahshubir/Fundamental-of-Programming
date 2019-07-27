/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Random;

/**
 *
 * @author WIC170074
 */
public class rev4 {

    /**
     * @param args the command line arguments
     */
   
    public static void main(String[] args) {
  
    // random char a-z
       int [] myInt = new int[10];
        char [] myChar = new char[10];
        
        Random rand= new Random();
        int myNum ;
        
        for (int i=0; i<myChar.length;i++)
        myChar[i]=(char)(rand.nextInt(26)+65);
        
         for (int i=0; i<myChar.length;i++)
        System.out.print(myChar[i]+ " ");
       
       
       
      
    }
    }