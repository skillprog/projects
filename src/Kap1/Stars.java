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
public class Stars {
    
    public static void main(String[] args) {
        
        //deklaration
        Scanner sc = new Scanner(System.in);
        int x;
        int i;
       
        
        //inmatningar
        System.out.println("mata in ett tal: ");
        x = sc.nextInt();
   
        //här körs loopen
        i = 0;
        while (i < x){
        
        System.out.print("*");
        i++;
       
        }
    }//end class
    
}//end main
