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
public class Stad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String stad;
        
        System.out.println("mata in tjeckoslovakien: ");
        stad = sc.nextLine();
        
        System.out.println("den gömda staden är: " + stad.substring(5, 9));
        
    }//end main
    
}//end class
