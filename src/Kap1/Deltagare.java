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
public class Deltagare {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x;
        
        //inmatningar
        System.out.println("hur många deltagare är anmälda? ");
        x = sc.nextInt();
        
        
        //valmöjlighet
        if (x < 12) {
            System.out.println("OK!");
        }
        
        else {
            System.out.println("För många");
        }
        
        
    }//end class
    
}//end main
