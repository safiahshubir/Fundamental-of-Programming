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
public class L7Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          
        try{
            ObjectInputStream r = new ObjectInputStream(new FileInputStream("person.dat"));
            String h;
            
//            while((h=r.readLine())!=null){
//                System.out.println(h);   
//            }
            
            //System.out.println(r.readInt());
//           
//            System.out.println(r.readLine());
            
            
            
            
            r.close();
        }catch(IOException e){
            System.out.println("Problem with output");
        }catch(NumberFormatException e){
            
        }
            
    }
    }
    

