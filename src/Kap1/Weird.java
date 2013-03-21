/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Weird {
    
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        char x;
        
        System.out.println("hatar du psykologi J/N? ");
        x = sc.next().charAt(0);

                
        if ( x == 'J' || x == 'j'){
            System.out.println("bra då leaver vi o snackar med tekin lärarna så fort som möjligt efteråt j");
        
        }
  
        
        else if (x == 'N' || x == 'n'){
        System.out.println("så");
    }
    
        else {
            System.out.println("jadu");
        }
        
    }//end class
}//end main
