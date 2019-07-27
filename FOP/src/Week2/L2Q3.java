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
public class L2Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,num3;
        int min=10;
        int max=50;
        
float sum,average;
Random random = new Random();
num1 = random.nextInt(max+1-min)+min;
        System.out.println(num1);
num2 = random.nextInt(max+1-min)+min;
        System.out.println(num2);
num3 = random.nextInt(max+1-min)+min;
        System.out.println(num3);
sum = (float)(num1+ num2+ num3);
average = sum/3;
System.out.printf("The sum of them is :" + "%6.2f", sum);
        System.out.println(" ");
System.out.printf("The average of them is :" + "%6.2f",average);



}
    }
    
