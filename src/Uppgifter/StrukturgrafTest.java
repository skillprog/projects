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
public class StrukturgrafTest {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x, y, summa;
        char forts;
        
        //inmatningar
        do{
            System.out.println("Mata in ett värde för x: ");
            x = sc.nextInt();
            System.out.println("Mata in ett värde för y: ");
            y = sc.nextInt();

            //beräkning och utskrift
            summa = x + y;
            System.out.println("summan är: " + summa);

            //ny beräkning
            System.out.println("vill du göra en ny beräkning? J/N:");
            forts = sc.next().charAt(0);
        
       }while(forts == 'j' || forts == 'J');
     
        //program slut
        System.out.println("Hejdå");
              
    }//end main
    
}//end class
