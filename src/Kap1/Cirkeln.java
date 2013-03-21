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
public class Cirkeln {
    
    public static void main(String[] args) {
      
            //deklaration
            Scanner sc = new Scanner(System.in);
            double pi, radie, area, omkrets;
            pi = 3.14159;
            
            
            //klass Support
            Support support = new Support();
            
            //inmatningar
            System.out.println("skriv in ett tal på radien: ");
            radie = sc.nextDouble();

            //area från Support
            area = support.arean(radie, pi);
            
            //omkrets från Support
            omkrets = support.omkretsen(radie, pi);
            
           
            
            //utskrift
            System.out.println("arean är: " + area);
            System.out.println("omkretsen är: " + omkrets);
           

       
        }//end main
    
}//end class

