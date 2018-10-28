/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week2810;

import java.util.Arrays;

/**
 *
 * @author hewa
 */
public class ex2 {
    public static void main(String[] args){
        int[] data= {1,2,3,4,5};
        //int eData[]= expandArray(data,7);
        int[] eData=new int[9];
        int[] tData=new int[2];
        //int[] tData= expandArray(data,3);
        System.out.println("Using for loop");
        System.out.println("Original Array"+ Arrays.toString(data));
        System.out.println("Expanded Array"+ Arrays.toString(eData));
        System.out.println("Truncated Array"+ Arrays.toString(tData));
        
        //int[] eData=new int[9];
        //int[] tData=new int[2];
        
        System.arraycopy(data, 0, eData, 0, 5);
        System.arraycopy(data, 0, eData, 0, 2);
        System.out.println("Using for loop");
        System.out.println("Using for loop"+ Arrays.toString(data));
        System.out.println("Using for loop"+ Arrays.toString(eData));
        System.out.println("Using for loop"+ Arrays.toString(tData));
        
        
         
        
    }
    
}
