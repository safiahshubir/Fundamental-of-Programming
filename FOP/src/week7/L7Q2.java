/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week7;

import java.io.*;
import java.util.Scanner;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author user
 */
public class L7Q2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            try {
            URL u = new URL("http://www.fsktm.um.edu.my");
            URLConnection cnn = u.openConnection();
            InputStream stream = cnn.getInputStream();
            Scanner in = new Scanner(stream);
            
            File file = new File("index.htm");
            PrintWriter out = new PrintWriter(file);
            while(in.hasNextLine()) {
                String s = in.nextLine();
                out.write(s);
        }

        }catch (IOException e) {
            System.out.println("IO Error:" + e.getMessage());
        }

    }
    
}
