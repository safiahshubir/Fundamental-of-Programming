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
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1,num2,result;
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter two interger numbers: ");
        num1=sc.nextInt();
        num2=sc.nextInt();
        System.out.print("Enter the operand: ");
        char a=sc.next().charAt(0);
        switch(a){
            case'+':
                result=num1+num2;
                System.out.print(num1 + "+"+ num2 + "=" + result);
                break;
            case'-':
                result=num1-num2;
                System.out.println(num1+"-"+num2+"="+result);
                break;
            case'*':
                result=num1*num2;
                System.out.println(num1+"*"+num2+"="+result);
                break;
            case'/':
                result=num1/num2;
                System.out.println(num1+"/"+num2+"="+result);
                break;
            case'%':
                result=num1%num2;
                System.out.println(num1 +"%"+num2+"="+result);
                break;
                                
        }
        
    }
    
}
