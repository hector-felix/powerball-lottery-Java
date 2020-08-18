/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.Arrays;
import java.io.*;  
import java.net.*; 

/**
 *
 * @author Hector Felix
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        try{ 
            
InetAddress ip=InetAddress.getByName("www.csudh.edu");  
InetAddress ip1=InetAddress.getLocalHost();
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  

System.out.println("IP Address!: "+ip1.getHostAddress());
}catch(Exception e){System.out.println(e);}  
//        
//        int first,second,third,fourth,fifth,mega;
//        
//        //return (int) (Math.random() * ((2019 - 1980) + 0)) + 1980;
//        
//        first = (int) (Math.random() * ((70 - 1) + 1));
//        second = (int) (Math.random() * ((70 - 1) + 1));
//        third = (int) (Math.random() * ((70 - 1) + 1));
//        fourth = (int) (Math.random() * ((70 - 1) + 1));
//        fifth = (int) (Math.random() * ((70 - 1) + 1));
//        mega = (int) (Math.random() * ((70 - 1) + 1));
//        
//        
//        int[] intArray = new int[]{first,second,third,fourth,fifth};
//        Arrays.sort(intArray);
//        System.out.println(Arrays.toString(intArray)+" \nMEGA: "+mega);
        
        //System.out.println("First: "+first+"\nSecond: "+second+"\nThird: "+third+"\nFourth: "+fourth+"\nFifth: "+fifth+"\n\nMega: "+mega);
    }
    
}
