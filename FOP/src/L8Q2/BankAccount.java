/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q2;

/**
 *
 * @author user
 */
public class BankAccount {
   private String name;
    private double balance;
    private double deposit;
    private int passportNo;
    
//    public BankAccount(){
//        this.balance = 0;
//        this.name = " ";
//    }
    public BankAccount(String name, int passportNo, double deposit){
        this.name = name;
        this.passportNo = passportNo;
        this.deposit = deposit;
    }
    
    public void deposit(double amount){
        balance =  balance + amount;
        System.out.printf("You've deposited RM %.2f\n",amount);
    }
    public void withdraw(double amount){
        balance = balance - amount;
        System.out.printf("You've withdrew RM %.2f\n",amount);
    }
    public void getBalance(){
        System.out.printf("Your balance is RM %.2f\n",balance);
    }
}
