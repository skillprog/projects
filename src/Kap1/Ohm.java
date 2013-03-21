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
public class Ohm {   
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        double r, u, i;
        char forts;
        
        //do loop
        do{ 
            //inmatningar
            System.out.println("skriv in ett tal för strömmen: ");
            i = sc.nextDouble();
            System.out.println("skriv in ett tal för resistansen: ");
            r = sc.nextDouble();

            OhmMetod Ohmen = new OhmMetod();
            
            //beräkning
            u = r*i;

            //utskrift
            System.out.println("spänningen är " + u);

            System.out.println("En gång till? J/N");
            forts = sc.next().charAt(0);
        } while (forts == 'J' || forts == 'j');
        
    }//end main    

}//end class
