/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tutorial6;

/**
 *
 * @author WIC170074
 */
public class q1d {
    
    public static int showPentagonalNumber(int n){
            int Pn= n*(3*n-1)/2;
            return Pn;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(showPentagonalNumber(5));
    }
    
}
