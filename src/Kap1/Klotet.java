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
public class Klotet {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double radie, volym, pi;
        pi = 3.14159;
        
        //inmatningar
        System.out.println("skriv ett värde för klotets radie: ");
        radie = sc.nextDouble();
        
        
        //beräkningar
        volym = 4*pi*radie*radie*radie/3;
        
        //utskrift
        System.out.println("volymen på klotet är " + volym);
       
        
        
        
    }//end class
    
}//end main
