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
public class Fredrik {
    
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x, y, summa;
        char forts;
        
        do{
            System.out.println("Skriv ett tal: ");
            x = sc.nextInt();
            System.out.println("skriv ett till tal: ");
            y = sc.nextInt();

            summa = x + y;

            System.out.println("summan är: " + summa);

            System.out.println("ny beräkning J/N: ");
            forts = sc.next().charAt(0);
         }while(forts == 'J' || forts == 'j');
        
        System.out.println("hejdå!");
        
        
        
        
    }//end main
    
}//end main
