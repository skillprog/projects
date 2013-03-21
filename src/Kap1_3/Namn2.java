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
public class Namn2 {
    
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            String namn, namn2;

            System.out.println("vad heter du?:");
            namn = sc.next();
            System.out.println("vad heter person nummer 2?: ");
            namn2 = sc.next();

            //if sats
            if (namn.equals(namn2)){
                System.out.println("era namn är lika");
            }else{
                System.out.println("ni har olika namn");
            }//end else
            
    }//end main
    
}//end class

