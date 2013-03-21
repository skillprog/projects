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
public class Ohmen {
    
    public static void main(String[] args) {
        //deklaration
        Scanner sc = new Scanner(System.in);
        double u, r, i;
        char forts;
        OhmHjalp berakning = new OhmHjalp();
        
                //do loop 
                do{    
                System.out.println("mata in strömmen i: ");
                i = sc.nextDouble();
                System.out.println("mata in resistansen r: ");
                r = sc.nextDouble();
            
                u = berakning.berakning(i, r);
                 
                System.out.println("spänningen är: " + u);

                System.out.println("en gång till? J/N: )");
                forts = sc.next().charAt(0);
                }while (forts == 'j' || forts == 'J');
        
            //slut
            System.out.println("Hejdå!");

    }//end main
    
}//end class
