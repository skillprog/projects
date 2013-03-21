/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Namn4 {
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        String stad;
        
        //inmatningar
        System.out.println("Mata in ordet tjeckoslovakien: ");
        stad = sc.next();
        
        //utskrift
        System.out.println("Staden är: " + stad.substring(5,9));
        
        
    }//end main 
    
}//end class
