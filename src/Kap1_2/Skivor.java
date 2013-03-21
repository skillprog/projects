/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Skivor {

    public static void main(String[] args) {
        
            //deklaration
            Scanner sc = new Scanner(System.in);
            DecimalFormat d = new DecimalFormat("0.##");
            double sum;
            int x;
            String formatertTal;

            //inmatningar
            System.out.println("hur många skivor önskas?: ");
            x = sc.nextInt();

           //alternativ 
           if (x >= 100) {
               sum = x * 9.9 * 0.85;
               formatertTal = d.format(sum);
               System.out.println("priset blir:" + formatertTal);
           }//end if

           else if (x >= 50) {
               sum = x * 9.9 * 0.9;
               formatertTal = d.format(sum);
               System.out.println("priset blir:" + formatertTal);
           }//end else if
           
           else if (x >= 10){
               sum = x * 9.9 * 0.95;
               formatertTal = d.format(sum);
               System.out.println("priset blir:" + formatertTal);
           }//end else if

           else {
               sum = x * 9.9;
               formatertTal = d.format(sum);
               System.out.println("priset blir" + formatertTal);
           }//end else     
       
  }//end main   

}//end class

