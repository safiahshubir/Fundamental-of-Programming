/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;

import java.util.Scanner;

/**
 *
 * @author WIC170074
 */
public class q1e {
    
    public static int countLetters(String s){
        int num=0;
        for(int i=0; i<s.length();i++)
         
            if(Character.isLetter(s.charAt(i))){
                num++;
    }
            return num;
}
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String a=input.nextLine();
        
        System.out.println("The number of letters in string is " + countLetters(a));

    }
    
}
