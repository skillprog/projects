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
public class Matte {
    
    public static void main(String[] args) {
           
            //Deklaration
            Scanner sc = new Scanner(System.in);
            int x, y, sum, diff, prod;

            //inmatningar
            System.out.println("skriv in ett tal: ");
            x = sc.nextInt();
            System.out.println("skriv in ett till tal: ");
            y = sc.nextInt();

            //beräkningar
            sum = x + y;
            diff = x / y;
            prod = x * y;

            //utskrift
            System.out.println("summan är:" + sum);
            System.out.println("Differensen är:" + diff);
            System.out.println("produkten är:" + prod);
        
    }//end main 
    
}//end class
