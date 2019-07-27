/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week2;

import java.util.Random;

/**
 *
 * @author user
 */
public class L2Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
     int num, Reminder, Sum = 0;
         Random ran =  new Random();
       
        num = ran.nextInt(10001);
        System.out.println("The number = " + num);
        
       while(num > 0) {
			Reminder = num % 10;
			Sum = Sum+ Reminder;
			num = num / 10;
		}
		System.out.println(" The sum of all the digits in the number = " + Sum);

    }
    
    }
