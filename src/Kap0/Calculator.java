/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap0;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Calculator {
    
    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
char svar;
System.out.print("Vill du se en loop? J/N ");
svar = sc.next().charAt(0);
if(svar == 'J' || svar == 'j'){
for(int i = 0; i < 10; i++){
System.out.println("Detta är en loop");
}
}
System.out.println("Slut");
        
    
    
    }



}//end main
