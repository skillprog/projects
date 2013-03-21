/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Matte2 {
    
    public static void main(String[] args) {
        
            //deklaration
            Scanner sc = new Scanner(System.in);
            int x, y, sum, diff, prod;
            char igen;

            
         do{
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

            System.out.println("Ny beräkning? J/N");
            igen = sc.next().charAt(0);
            }while (igen == 'J' || igen == 'j');       
        
          
    }//end main
    
}//end class
