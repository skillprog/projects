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
public class Ram {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String namn;
        
        System.out.println("vad heter du?: ");
        namn = sc.next();

        System.out.println("********");
        System.out.print("*");
        System.out.print("" + namn);
        System.out.println(" *");
        System.out.println("********");
        
    }//end main
    
}//end class
