/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;


/**
 *
 * @author ankg01
 */
public class TalMetod {
    
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
        double forsta, andra, min;
        min = 0;
        
        
        System.out.println("mata in ett tal: ");
        forsta = sc.nextDouble();
        
        System.out.println("mata in ett til tal: ");
        andra = sc.nextDouble();
    
        Metoden minst = new Metoden();
       
        min = minst.minst(forsta , andra);
        
        System.out.println("det minsta talet är: " + min );
        
        
    }//end main
    
}//end class
