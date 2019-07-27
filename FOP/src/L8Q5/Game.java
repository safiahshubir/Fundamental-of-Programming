/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package L8Q5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Game {
    private String name;
    
   
    public Game(String name){
        this.name = name;
    }
    
    public int roll(){
        Random rand = new Random();
        int result = rand.nextInt(6)+1;
        
        return result;
    }
    public String getName(){
        return name;
    }
}