/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week3;

import java.util.Scanner;

/**
 *
 * @author WIC170074
 */
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double sv, com;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Sales Volume:RM ");
        sv=sc.nextDouble();
        if(sv<=100){
            com=sv*0.05;
            System.out.println("Commission:RM "+com);
        }
        else if((sv>100)&&(sv<=500)){
            com=sv*0.075;
            System.out.println("Commission:RM "+com);
        }
        else if ((sv>500)&&(sv<=1000)){
            com=sv*0.1;
            System.out.println("Commission:RM "+com);
        }
        else{
            com=sv*0.125;
            System.out.println("Commission:RM "+com);
        }
        }
        }
        
    
    
