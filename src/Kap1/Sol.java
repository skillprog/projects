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
public class Sol {

    public static void printSoltimmar(String namn, int antalTimmar) {
        System.out.print(namn);
        for(int i=0; i<antalTimmar; i++) {
            System.out.print("*");
        }
        System.out.println("");
    }
    
    public static void doSoltimmar() {
        //deklaration
        Hours HoursObject = new Hours(); 
        
        HoursObject.nystad();
        
        //metod för inmatning
        HoursObject.timmar();

        //villkor för Oslo
        printSoltimmar("O:", HoursObject.getTimmarOslo());

        //villkor för Stockholm
        printSoltimmar("S:", HoursObject.getTimmarStockholm());

        //villkor för Helsingfors
        printSoltimmar("H:", HoursObject.getTimmarHelsingfors());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String avsluta, stad;
        char tecken;
        while (true){
             doSoltimmar();
            System.out.println("vill du avsluta programmet?:(J/N) ");
            avsluta = sc.nextLine();    
            tecken = avsluta.charAt(0);
            if (tecken == 'J' || tecken ==  'j'){
                break;
            }//end if
            
        }//end while
        
    }//end class 
    
}//end main
