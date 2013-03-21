/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Chansen {
    private static int o;
    
    
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
       char c;
     
        System.out.println("valj alternativ A/B : ");
        c = sc.next() .charAt(o);
        System.out.println("Du skrev tecknet " + c);
        
        if (c == 'a' || c == 'A'){
            System.out.println("Grattis du vann en resa till Stockholm");
        }
        else if (c == 'f') {
            System.out.println("Nitlott");
        }
        
        else if (c == 'q' || c == 'Q') {
            System.out.println("aa smit inte nu här");
}
       
        else if (c == 'b') {
       System.out.println("du vann en häst!!");
}


}//end class

}//end main
