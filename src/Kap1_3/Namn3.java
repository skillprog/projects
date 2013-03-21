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
public class Namn3 {
    
    public static void main(String[] args) {
        
        //Deklaration
        Scanner sc = new Scanner(System.in);
        String fnamn, enamn;
        String helaNamnet;
        
        //inmatningar
        System.out.println("ange ditt förnamn :");
        fnamn = sc.nextLine();
        System.out.println("ange ditt efternamn: ");
        enamn = sc.nextLine();
        
        //utskrift initialer
        System.out.print("Dina initialer är: " + fnamn.charAt(0));
        System.out.print("." + enamn.charAt(0));
        System.out.println("");
        
        System.out.println("Skriv in hela ditt namn: ");
        helaNamnet = sc.nextLine();
        
        System.out.print(helaNamnet.charAt(0));
        
        for(int i = 0; i < helaNamnet.length(); i++){
            if(helaNamnet.charAt(i) == ' '){
                System.out.print("." + helaNamnet.charAt(i + 1));
            }
        }
        
        //avstånd
        System.out.println("");
        
    }//end main 
}//end class
