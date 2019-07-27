/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L8Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankAccount bank = new BankAccount("Danial",980416,500.00);
        
        bank.deposit(1500.50);
        bank.withdraw(200.00);
        bank.getBalance();
        
    }
    
}