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
public class Summmera2 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char fortsatt;
        int x, y, s;
        
        do {
            System.out.println("skriv ett tal ");
            x = sc.nextInt();
            System.out.println("skriv ett till tal");
            y = sc.nextInt();
            s=x+y;
            System.out.println("summan är: " + s);
            System.out.println("Ny beräkning? J/N ");
            fortsatt = sc.next().charAt(0);
            } 
        
            while (fortsatt == 'j' || fortsatt == 'J');
        
        
        
    }//end class
    
}//end main
