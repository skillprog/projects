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
public class Aritmetik {
    
    public static void main(String[] args) {
   //deklaration
        Scanner sc = new Scanner(System.in);
        double x, y, sum, diff, produkt, kvot;
        
        //inmatning
        System.out.println("skriv ett tal:");
       x = sc.nextDouble();
        System.out.println("skriv in ett till tal");
        y = sc.nextDouble();
        
        //beräkning
        sum = x + y;
        diff = x - y;
        produkt = x * y;
        kvot = x / y;
 
        
        //utskrift
        System.out.println("summan är " + sum);
        System.out.println("differensen är " + diff);
        System.out.println("produkten är " + produkt);
        System.out.println("kvoten är " + kvot);
         
    
    }//end main
    
}//end class
