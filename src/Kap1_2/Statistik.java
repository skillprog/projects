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
public class Statistik {
    
    public static void main(String[] args) {
        
            //deklaration
            Scanner sc = new Scanner(System.in);
            double summa;
            int tal, n, max;
            summa = 0;
            max = 0;

            //iterering
            System.out.println("hur många tal ska behandlas?: ");
            n = sc.nextInt();
            System.out.println("Mata in så många positiva tal: ");

            //for loop beräkning av summan 
            for(int i = 0; i < n; i++) 
            {
                tal = sc.nextInt();

                summa = summa + tal;            

                if (tal > max){
                    max = tal;
                }//end if sats 
            }//end for loop
       
            //Utskrift
            System.out.println("summan är: " + summa);
            System.out.println("medelvärdet är: " + summa/n);
            System.out.println("det största värdet är: " + max);

        
    }//end main
    
}//end class
