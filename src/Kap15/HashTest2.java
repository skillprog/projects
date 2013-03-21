/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class HashTest2 {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<String, String>();
        String land;
        char svar;
        boolean fortsatt = true;
     
        while (fortsatt == true){
        System.out.println("");
        System.out.println("Välj");
        System.out.println("1. Skapa hashtabellen");
        System.out.println("2. Sök huvudstad");
        System.out.println("3. Visa hashtabellens innehåll");
        System.out.println("4. Geografiförhör");
        System.out.println("0. Avsluta");
        try{
            svar = sc.next().charAt(0);
            switch(svar){
            
                case '1':
                    ht.put("Danmark", "Köpenamn");
                    ht.put("Sverige", "Stockholm");
                    ht.put("Norge", "Oslo");
                    ht.put("Ryssland", "Moskva");
                    ht.put("Tyskland", "Berlin");
                    ht.put("Finland", "Helsingfors");
                    ht.put("Frankrike", "Paris");
                    System.out.println("färdigt");
                    break; 
                    case '2':
                    System.out.print("Land? ");
                    land = sc.nextLine();
                    System.out.println("Huvudstad: " + ht.get(land));
                    break;
                case '3':
                    for(String nyckel : ht.keySet()){
                    System.out.println(nyckel + ": ");
                    System.out.println("Huvudstad: " + ht.get(nyckel));
                    }//end for
                    break;
                case '4':
                    for (String nyckel : ht.keySet()){
                    System.out.print("Vad heter huvudstaden i " + nyckel + "? ");
                    String svaret = sc.nextLine();}
                    break;
                case '0':
                    System.out.println("programmet avslutat");
                    fortsatt = false;
                    break;
                default:
                    break;
    
            }//end switch
         
        }//end try
        catch (Exception e) {}
            
        
        }//end while   
    }//end main
}//end class

