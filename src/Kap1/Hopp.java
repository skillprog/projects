/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Hopp {
    
    public static void main(String[] args) {
        //deklaration 
        Scanner sc = new Scanner(System.in);
        double hopp,vind;
        boolean rekord;
        Support rekordet = new Support();
        
        //inmatningar
        System.out.println("ange hur högt du hoppade: ");
        hopp = sc.nextDouble();
        System.out.println("hur stor var vindstyrkan i m/s?: ");
        vind = sc.nextDouble();
        
        rekord = rekordet.rekordet(hopp, vind);
        
        System.out.println("" + rekord);
        
        
    }//end main
    
}//end class
