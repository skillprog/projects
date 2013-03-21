/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uppgifter;

import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class StrukturgraftTest2 {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        char svar;
        int i;
        
            //inmatning
            System.out.println("vill du se en loop? J/N:");
            svar = sc.next().charAt(0);
        
            //if alternativ
            if (svar == 'j' || svar == 'J'){
        
                //for loop
                for(i = 0; i < 10; i++){
            
                    System.out.println("Detta är en loop");
                
                }//end for
            
            }//end if
        
             //slut   
             System.out.println("Slut");
        
    }//end main
    
}//end class
