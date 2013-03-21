/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author Anton Karmeborg
 */
public class StackTest 
{
    
    public static void main(String[] args) 
    {
        Stack<String> minStack = new <String>Stack();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;
        
        while(fortsatt){
            System.out.println("STACK: ");
            
            if(minStack.isEmpty()){System.out.println("Ingen stack just nu");
            }else{
                for(String namn : minStack) System.out.println(namn + "  ");
            }//end else
            
            System.out.println();
            System.out.println("Välj:");
            System.out.println("1. Lägg en tallrik på tallrikstraven");
            System.out.println("2. Vems tallrik ligger nu högst upp?");
            System.out.println("3. Ta bort översta tallriken");
            
            System.out.println("0. Avsluta");
            try{
                svar = sc.next().charAt(0);
                switch(svar){
                    case '1':
                        System.out.println("Vems tallrik?: ");
                        String namn = sc.nextLine();
                        minStack.push(namn);
                        break;
                        
                    case '2':
                        System.out.println("högst upp är: " + minStack.peek() + " tallrik");
                        System.out.println(" (Tryck ENTER)"); sc.nextLine();
                        break;
                    
                    case '3':
                        System.out.println("Tar bort " + minStack.pop() + " tallrik");
                        System.out.println(" (Tryck ENTER) "); sc.nextLine();
                        break;
                                    
                    case '0':
                        fortsatt = false;
                        System.out.println("SLUT");
                        break;
                    default :
                        break;
                }//end switch
            }//end try
            catch(Exception e){}
            System.out.println();
        
        }//end while
    }//end class
}//end class
