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
public class IfTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;
        
        
        System.out.println("ange x" );
        x = sc.nextInt();
        System.out.println("ange y" );
        y = sc.nextInt();
        
        
        if (x > 0 && y > 0) {
        
            System.out.println("båda talen är positiva");
         }
            
        else if (x > 0 || y < 0) {
            System.out.println("ett av talen är positiva");
        }    
            
        else {
            System.out.println("inget av talen är psoitiva");
        }
        
    }//end class
    
}//end main
