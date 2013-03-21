/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class Betyg {
    
    //deklaration
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        
        
        //inmatningar
        System.out.println("skriv in ditt poäng du fick på provet: ");
        x = sc.nextInt();
    
    //alternativ och utskrift    
    if (x >= 50) {
        System.out.println("Godkänd");
    }   
    
    else if (x < 50) {
        System.out.println("ej godkänd");
    }
    
    }//end class
    
}//end main
