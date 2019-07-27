/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class L7Q4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           int characterCount = 0;
        int linesCount = 0;
        int words = 0;
        try{                        
            try(BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))){
                int character;
                while((character = buff.read())> 0){        
                   //System.out.println(character);
                    characterCount++;
                } 
            buff.close();
            }    
            try(Scanner sc = new Scanner(new FileInputStream("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))){
                while(sc.hasNext()){
                   // System.out.println(sc.next());
                    sc.next();
                    words++;
                }  
                
            sc.close();
            }
            try (BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))) {
                String line;
                while((line = buff.readLine())!= null){
                  //  System.out.println(line);
                    linesCount++;
                }
            buff.close();
            }
            
        }catch(IOException e){
            System.out.println("Problem with output");
        }    
        System.out.println("Number of characters : "+characterCount);
        System.out.println("Number of words : "+words);
        System.out.println("Number of lines : "+linesCount);
    }
    
    }
    

