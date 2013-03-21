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
public class Namn {

    public static void main(String[] args) {
        
            //deklaration
            Scanner sc = new Scanner(System.in);
            String namn;

            //inmatningar
            System.out.println("Vad heter du?: ");
            namn = sc.next();

            //iteration
            for(int i = namn.length()-1; i >= 0; i--){
                System.out.print(namn.charAt(i));
            }
            //avstånd
            System.out.println("");

        }//end main

}//end class
