/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

import java.util.Random;

/**
 *
 * @author WIC170074
 */
public class rev5 {

   public static int mySearch(char[] unSorted, char myChar){
       int index=-1;
        char[] sorted = mySort(unSorted,'>');
        
        
        for(int i=0;i<sorted.length;i++)
          if(sorted[i]==myChar)  
              index=i;
   return index;
   }
   
    public static char[] mySort(char[] unSort, char sym){
        
        if(sym=='>'){

            for(int i=0;i<unSort.length;i++)
                for(int j=i+1; j<unSort.length;j++)
                    if(unSort[i]>unSort[j]){
                        char temp = unSort[i];
                        unSort[i] = unSort[j];
                        unSort[j] = temp;
        }
        }
        else
        {    
              for(int i=0;i<unSort.length;i++)
                for(int j=i+1; j<unSort.length;j++)
                    if(unSort[i]<unSort[j]){
                        char temp = unSort[i];
                        unSort[i] = unSort[j];
                        unSort[j] = temp;           
                    
                    }
        }
        return unSort;
    }

   public static void main(String[] args) {
    int [] myInt = new int[10];
        char [] myChar = new char[10];
        
        Random rand= new Random();
        int myNum ;
        
        for (int i=0; i<myChar.length;i++)
        myChar[i]=(char)(rand.nextInt(26)+65);
        
        System.out.println(" unsorted: ");
         for (int i=0; i<myChar.length;i++)
        System.out.print(myChar[i]+ " ");
         
   char[] sortedChar=mySort(myChar,'>');
    
        System.out.println("\nSorted Asc:");
           for (int i=0; i<sortedChar.length;i++)
        System.out.print(sortedChar[i]+ " ");
       
           int index=mySearch(myChar,'C');
           
           if(index==-1)
               System.out.println("\nCharacter not found!");
            else
               System.out.println("\nThe index is:"+index);
                   
   }
   }