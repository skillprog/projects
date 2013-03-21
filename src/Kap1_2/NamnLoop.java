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
public class NamnLoop {
    
    public static void main(String[] args) {        
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        String namn;  
        int antal;
        
        //Inmatningar
        System.out.println("Vad heter du?: ");
        namn = sc.next();
        System.out.println("Hur många utskrifter önskas?: ");
        antal = sc.nextInt();
        
        //for loop utskrift
        for(int i = 0; i < antal; i++){
                  System.out.println("Du heter " + namn);
        }
        
    }//end main
    
}//end class
