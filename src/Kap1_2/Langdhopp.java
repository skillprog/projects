/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import Kap1.Support;
import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class Langdhopp {
 
    public static void main(String[] args) {
        
            //deklaration
            Scanner sc = new Scanner(System.in);
            double hojd, ms;
            boolean result;
           
            //klass för metod
            Support support = new Support();
            
            //inmatningar
            System.out.println("hur högt hoppade du?: ");
            hojd = sc.nextDouble();
            System.out.println("hur kraftig var vindstyrkan den dagen i m/s?: ");
            ms = sc.nextDouble();

            //result mottag från klass
            result = support.berakna(hojd, ms);
            
            //alternativ och utskrift
            if (result == true){
                System.out.println("Du har tagit ett nytt rekord!");
            }
            
            else{
                System.out.println("You have failed me again!");
            }
        
      }//end main
    
}//end class
