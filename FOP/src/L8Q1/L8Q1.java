/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q1;

/**
 *
 * @author user
 */
public class L8Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Number n = new Number();
        
        System.out.println("Array of random integers");
        int[] item = n.getArrayOfItem();
        for(int i = 0; i<item.length;i++){
            System.out.printf("%4d ", item[i]);
        }
        System.out.println("");
        System.out.println("EVEN NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getEven(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }
        System.out.println("");
        System.out.println("PRIME NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getPrime(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }    
        System.out.println("");
        System.out.println("MAXIMUM NUMBERS");
        System.out.printf("%4d\n",n.getMax());
        System.out.println("MINIMUM NUMBERS");
        System.out.printf("%4d\n",n.getMin());
        System.out.println("AVERAGE");
        System.out.printf("%4.2f\n",n.getAverage());
        System.out.println("SQUARE NUMBERS");
        for(int i = 0;i<item.length; i++){
            if(n.getSquare(item[i])){
                System.out.printf("%4d ", item[i]);
            }
        }
        System.out.println("");
    }
    
}