/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.io.*;

/**
 *
 * @author user
 */
public class L7Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         try{
            BufferedReader buff = new BufferedReader(new FileReader("AncientGreymon.txt"));
            BufferedWriter reverse = new BufferedWriter(new FileWriter("reverse.txt"));
            String line;
            while((line = buff.readLine()) != null){
                StringBuilder line1 = new StringBuilder();
                line1.append(line);
                line1 = line1.reverse();
                System.out.println(line1);
                //toString()is needed when writing a StringBuilder into a text file
                reverse.write(line1.toString());
                
            }
            reverse.close();
            buff.close();
        }catch (IOException e){
            System.out.println("Problem");
        }    
        
    }
    
}
