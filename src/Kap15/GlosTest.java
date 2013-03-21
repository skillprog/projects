/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class GlosTest 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        HashMap<String, String> hm = new HashMap<String, String>();
        boolean fortsatt =  true;
        char svar;
        String glosa;
        int antalratt = 0; 
        
        while(fortsatt == true){
        System.out.println("Välj");
        System.out.println("1. Skapa gloslista");
        System.out.println("2. Visa gloslista");
        System.out.println("3. Skriv in ny glosa");
        System.out.println("4. Glostest");
        System.out.println("0. Avsluta");
        svar = sc.next().charAt(0);
        try{
        switch(svar){
        
            case '1':
                hm.put("sol", "sun");
                hm.put("måne", "moon");
                hm.put("regn", "rain");
                hm.put("snö", "snow");
                System.out.println("Gloslista skapad");
                break;
                
            case '2':
                System.out.println("gloslistan: " + hm);
                break;
                
            case '3':
                System.out.println("skriv in ny glosa på svenska: ");
                String nyGlosa = sc.next();
                System.out.println("Skriv in ny glosa på engelska: ");
                String nyGlosaEng = sc.next();
                hm.put(nyGlosa, nyGlosaEng);
               break;
            case '4':
                for (String nyckel : hm.keySet()){
                System.out.print("Vad är glosan till " + nyckel + "? ");
                String svaret = sc.next();
                    if (svaret.equals(hm.get(nyckel))) {
                        System.out.println("Rätt");
                        antalratt++;
                    }else{
                        System.out.println("Fel, rätt svar är: " + hm.get(nyckel));
                    }//end else
                    
                }//end for
                if(antalratt == hm.size()){
                    System.out.println("Du fick alla rätt");
                }//end if
                
            case '0':
                System.out.println("programmmet avslutat!");
                fortsatt = false;
                break;
                default:
                    break;
                
        }//end switch
        
      
        }//end try
        catch (Exception e){}
        
        }//end while
        
        
        
        
    }//end main
    
}//end class
