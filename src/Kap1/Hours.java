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
public class Hours {
    Scanner sc = new Scanner(System.in);
    int antalTimmarOslo, antalTimmarStockholm, antalSoltimmarHelsingfors;
    
    public void nystad(){
        System.out.println("mata in en ny stad: ");
        String stad = sc.nextLine();
        System.out.println("mata in antalet soltimmar: ");
        int a = sc.nextInt();
        System.out.println("" + stad);
        System.out.print("har " + a);
        System.out.print("soltimmar ");
        System.out.println("");
        
    }
    
    
        public void timmar(){
            
            System.out.println("hur många soltimmar har Oslo?: ");
            antalTimmarOslo = sc.nextInt();
            System.out.println("hur många soltimmar har Stockholm?: ");
            antalTimmarStockholm = sc.nextInt();
            System.out.println("hur många soltimmar har Helsingfors): ");
            antalSoltimmarHelsingfors = sc.nextInt();

            
       
        }//end public void timmar


        public int getTimmarOslo() {
            return antalTimmarOslo;
        }
        public int getTimmarStockholm() {
            return antalTimmarStockholm;
        }

        public int getTimmarHelsingfors() {
            return antalSoltimmarHelsingfors;
        }

        public void setTimmarOslo(int antalTimmar) {
            antalTimmarOslo = antalTimmar;
        }

        public void setTimmarStockholm(int antalTimmar) {
            antalTimmarStockholm = antalTimmar;
        } 

        public void setTimmarHelsingfors(int antalTimmar) {
            antalSoltimmarHelsingfors = antalTimmar;
        }
        
    
}//end class