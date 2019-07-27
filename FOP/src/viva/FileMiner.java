/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package viva;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class FileMiner {
     
    private int countChar;
    private int countLines;
    private int countWords;

    public FileMiner(int countChar, int countLines, int countWords) {
        this.countChar = countChar;
        this.countLines = countLines;
        this.countWords = countWords;
    }

  

    public int getCountChar() throws IOException {
        try(BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))){
                int character,characterCount=0;
                while((character = buff.read())> 0){        
                   //System.out.println(character);
                    characterCount++;
                } 
            buff.close();
        return countChar;
    }
    }

    public void setCountChar(int countChar) {
        this.countChar = countChar;
    }

    public int getCountLines() throws IOException {
         try (BufferedReader buff = new BufferedReader(new FileReader("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))) {
                int line,linesCount=0;
                while((line = buff.read())>0){
                  //  System.out.println(line);
                    linesCount++;
                }
            buff.close();
        return countLines;
                }
         }
    


    public void setCountLines(int countLines) {
        this.countLines = countLines;
    }

    public int getCountWords() throws FileNotFoundException {
                    try(Scanner sc = new Scanner(new FileInputStream("C:\\Users\\user\\Documents\\NetBeansProjects\\WIC170074\\WIC170074\\src\\week7\\Supercomputer.txt"))){
               int words=0;
                        while(sc.hasNext()){
                   // System.out.println(sc.next());
                    sc.next();
                    words++;
                }  
                
            sc.close();
        return countWords;
    }
    }
    public void setCountWords(int countWords) {
        this.countWords = countWords;
    }
     public static void main(String[] args) throws IOException {
         
         FileMiner file=new FileMiner(100,100,100);
        System.out.println("Number of characters : "+ file.getCountChar());
        System.out.println("Number of words : "+ file.getCountWords());
        System.out.println("Number of lines : "+ file.getCountLines());
}


}
    
    
    
    
    
    
    
    
    
    