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
public class L7Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         String[] code = {"WXES1116","WXES1115","WXES1110","WXES1112"};
        String[] name = {"Programming I", "Data Structure", "Operating System","Computing Mathematics I"};
                
        try{     
            FileOutputStream fis = new FileOutputStream("course.txt");
            ObjectOutputStream obj = new ObjectOutputStream(fis); 
    
            for(int i=0;i<code.length; i++){
                obj.writeUTF(code[i]);
                obj.writeUTF(name[i]);
            }
            
            obj.close();
            
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter code : ");
        String course_code  = sc.next();
        
        try{
            
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("course.dat"));
            while(true){
                if(course_code.equals(in.readUTF())){
                    System.out.println(in.readUTF());
                    break;
                }
            }
                      
            in.close();
        }catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Problem with file output");
        }
    }
    
}
