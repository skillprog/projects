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
public class Feber {
    
    public static void main(String[] args) {
        
        //initieringar
        Scanner sc = new Scanner(System.in); 
        double feber;
       
        //mata in
        System.out.println("vilken temp har du?");
        feber = sc.nextInt();
       
        //alternativ
        if (feber > 37.5) {
            System.out.println("du har FEBER!");
        } 
        
        else { System.out.println ("du har inte feber");
            }
        
        
    }//end class
    
}//end main
