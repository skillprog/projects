/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgifter;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Adress {

    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        String namn, stad, adress;
        int nummer;

        //inmatningar
        System.out.println("Vad heter du?: ");
        namn = sc.next();
        System.out.println("I vilken stad bor du?: ");
        stad = sc.next();
        System.out.println("vilken adress bor du på?: ");
        adress = sc.next();
        System.out.println("vad har du för nummer?: ");
        nummer = sc.nextInt();
        
        //Utskrift
        System.out.println("" + namn);
        System.out.println("" + stad);
        System.out.println("" + adress);
        System.out.println("" + nummer);
        
    }//end main
    
}//end class
