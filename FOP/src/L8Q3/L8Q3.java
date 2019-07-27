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
public class L8Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        WeightCalculator w = new WeightCalculator();
        
        System.out.print("Age? ");
        w.setAge(in);
        System.out.print("Height? ");
        w.setHeight(in);
        System.out.println("");
        w.getRecommendedWeight();
        w.display();
    }
    
}