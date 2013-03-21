/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class MinBil {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int car;
        int i;
       
        System.out.println("hur stor bil vill du se?: ");
        car = sc.nextInt();
        
        
        
           i = 0;
           System.out.print("   ");
           while (i < car){
               System.out.print("_");
               i++;
           }
        
        System.out.println("");
        System.out.print("__/");
        i = 0;
        while (i < car) {
            System.out.print("_");
            i++;
        }
        
        System.out.println("\\__");
        
        System.out.print("-o-");
        i = 0;
        while (i < car){
            System.out.print("-");
            i++;
        }
        
        
        System.out.print("-o-");
        
        
                
    }//end class
    
    
}//end main


