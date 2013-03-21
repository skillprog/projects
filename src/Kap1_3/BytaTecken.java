/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1_3;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class BytaTecken {
    
    public static void main(String[] args) {
        //loopad lösning
        test();
        //vanlig lösning
        test2();
        
        
    }//end main
    
    
    public static void test() {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder HemligtOrd = new StringBuilder("????");
        
      
        for (int i = 0; i < HemligtOrd.length(); i++){
            System.out.println(HemligtOrd.toString()); 
            System.out.println("Sätt in nästa tecken: ");
            char newchar = sc.nextLine().charAt(0);
            HemligtOrd.setCharAt(i, newchar);
        }
        System.out.println("Result: " + HemligtOrd);
    
    }//end test
    
    public static void test2() {
        Scanner sc = new Scanner(System.in);
        
        StringBuilder sb = new StringBuilder("????");       
        System.out.println(sb.toString()); 
        System.out.println("Enter next character:");
        char newchar = sc.nextLine().charAt(0);
        sb.setCharAt(0, newchar);

        System.out.println(sb.toString()); 
        System.out.println("Enter next character:");
        newchar = sc.nextLine().charAt(0);
        sb.setCharAt(1, newchar);

        System.out.println(sb.toString()); 
        System.out.println("Enter next character:");
        newchar = sc.nextLine().charAt(0);
        sb.setCharAt(2, newchar);

        System.out.println(sb.toString()); 
        System.out.println("Enter next character:");
        newchar = sc.nextLine().charAt(0);
        sb.setCharAt(3, newchar);

        System.out.println("Result:" + sb);
    }//end test
    
}//end class
