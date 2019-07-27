/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class WeightCalculator {
    private int age;
    private int height;
    private double weight;
    
    public WeightCalculator(){
        
    }
    
    public void setAge(Scanner in){
        age = in.nextInt();
    }
    public void setHeight(Scanner in){
        height = in.nextInt();
    }
    public double getRecommendedWeight(){
        weight = (height-100+age/10)*0.9;
        return weight;
    }
    public void display(){
        System.out.println("Age : " + age);
        System.out.println("Height : " + height + "cm");
        System.out.println("\nRecommended weight : " + weight + "kg");
    }
}