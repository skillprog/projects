/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class Summera {
    
    public static void main(String[] args) {
     
      Scanner sc = new Scanner(System.in);
  
        double x, y, sum;

        System.out.println("skriv ett tal");
        x = sc.nextInt();
        System.out.println("skriv ett till tal");
        y = sc.nextInt();
   
   sum = x / y;
          
        System.out.println("Summan är: " + sum);  
    
    }//end main
    
}//end class
