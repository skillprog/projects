/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_2;

import java.util.Scanner;

/**
 *
 * @author Anton Karmeborg
 */
public class Poang {
    public static void main(String[] args) {
       
        //deklaration
        Scanner sc = new Scanner(System.in);
        int poang;
        
        //inmatningar
        System.out.println("ange ditt poängscore: ");
        poang = sc.nextInt();
       
        
       if (poang >= 90) {
           System.out.println("MVG");
       }//end if
       
       
       else if (poang >= 75) {
           System.out.println("VG");
       } 
        
       else if (poang >= 50){
           System.out.println("G"); 
              }//end if else
       
       
       else {
           System.out.println("IG");
       }//end else
       
       
    }//end class
    
    
}//end main
