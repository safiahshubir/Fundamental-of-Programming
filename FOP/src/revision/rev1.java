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
public class rev1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     /*
        int[] num= new int[10]; //cara nak buat array
        num[0]=45;//buat first index dulu(position), tade{} sbb yg {} hnye kalo ada byk num.
        num[1]=55;
        num[2]=65;
        
        System.out.println(num[0]);
        System.out.println(num[1]);
        System.out.println(num[2]);
        
        System.out.println(num.length);// length ikut yg brpe byk digit tu. tapi inedx dia start dri '0'.
        
    }
    */
     
    /*
     int[] num=new int[10];
     Random rand= new Random();
   
     for(int i=0;i<num.length;i++)
         num[i]=rand.nextInt(100);
     
     for(int i=0;i<num.length;i++)
         System.out.print(num[i] + " ");
     
     
     //nak buat digit dia reverse
     for(int i=num.length - 1; i>=0;i--)//kena i>=0, sbb kite nk 0.
         num[i]=rand.nextInt(100);
  */
    /*
    int[] num=new int[10];
     Random rand= new Random();
     
        System.out.println((char)65);//"casting"cara masuk kan ascii code. just letak(char) dlm (), then letak no. ascii code dia.. utk keluar kan symbol dia.
        System.out.println((char)65 +""+(char)33);// output= A!
        
        */
    
    //SORTING
    
    int[] num=new int[10];
     Random rand= new Random();
        System.out.println("unsorted:");
     for(int i=0;i<num.length;i++){
         num[i]=rand.nextInt(100);
     
        System.out.print(num[i]+ " ");
     }
        System.out.println("\nsorted:");
     for(int i=0; i<num.length-1;i++)
         for(int j=i+1;j<num.length;j++)// knp j=i+1, sbb kite nk num selepas i tu 
             if(num[i]>num[j]){ // kalo nak sort ascending letak >, kalo descending letak <
             int hold=num[i];
             num[i]=num[j];
             num[j]= hold;
              System.out.print(num[i]+ " ");
         }
       
         }
}


