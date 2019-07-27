/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Week6;

/**
 *
 * @author user
 */
public class L6Q1 {



//method to return a triangular number
   

    public static void main(String[] args) {
            System.out.println("The first 20 triangular numbers are\n");
        for(int x = 1; x <= 20; x++){
            
                System.out.print(getTriangular(x)+" "); 
           
        }
    }
    //method to return a triangular number
    public static int getTriangular(int tri){  
        int sum = 0;
        for(int i = 1; i <= tri; i++){
            sum += i;
        }
        //System.out.println(sum);
        return sum;
    }
}