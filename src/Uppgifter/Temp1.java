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
public class Temp1 {
 
    public static void main(String[] args) {
        double celsius, f = 0;
        Scanner sc = new Scanner(System.in); 
        
        System.out.println("Ange en temperatur i grader Celsius: ");
        celsius = sc.nextDouble();
        
        TempOmvandling TempOmvandlingObject = new TempOmvandling();
                
        TempOmvandlingObject.grader();
       
        System.out.println("Tempen är: " + f);
        
    }//end main
    
}//end class
