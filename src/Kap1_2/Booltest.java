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
public class Booltest {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int alder;
        boolean myndig;
        
        System.out.println("ange din ålder: ");
        alder = sc.nextInt();
        
        myndig = alder > 17;
        
        if (myndig) {
            System.out.println("du är myndig!");
        }
        
        else {
            System.out.println("du är inte myndig");
        }
        
    }//end class
}//end main
