/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHangman;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Version1 
{
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        String hemligtOrd = "programmera";
        StringBuilder frageTeckenLista = new StringBuilder();
        StringBuilder felTecken = new StringBuilder();
        int antalLiv = 6;
        boolean livKoll;
        boolean klaraDet = false;
        
        for (int i = 0; i < hemligtOrd.length() ; i++) 
        {
            frageTeckenLista.append('?');
        }//end for
        
        System.out.println(frageTeckenLista.toString());
        
        
        while(antalLiv > 0 && klaraDet == false)
        {
        livKoll = false;
        System.out.println("Gissa på en bokstav: ");
        char gissadBokstav = sc.next().charAt(0);
        gissadBokstav = Character.toLowerCase(gissadBokstav);
        
        for (int i = 0; i < hemligtOrd.length(); i++) 
        {
            if(hemligtOrd.charAt(i) == gissadBokstav)
            {
                frageTeckenLista.setCharAt(i, gissadBokstav);
                livKoll = true;
            }//end if
        
        }//end for                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   
        
        if(livKoll == false)
        {
            antalLiv--;
            felTecken.append(gissadBokstav);
        }//end if
        
        switch(antalLiv)
        {
            case 5: System.out.println("ett slag");
            break;
        
            case 4:System.out.println("två slag");
            break;
                
            case 3: System.out.println("tre slag");
            break;
        
            case 2:System.out.println("fyra slag");
            break;
        
            case 1: System.out.println("fem slag");
            break;
        
            case 0:System.out.println("sex slag");
            break;
        }  
        
        System.out.println("felinmatade tecken: " + felTecken.toString());
        System.out.println("du har: " + antalLiv + " liv kvar");
        
        if(antalLiv == 0){
            System.out.println("du det där var inte bra");
            System.out.println("Det hemliga ordet var: " + hemligtOrd);
        }//end if
        
        if(hemligtOrd.equals(frageTeckenLista.toString()))
        {
            System.out.println("Grattis du klara det");
            klaraDet = true;
        }//end if
        
        System.out.println(frageTeckenLista.toString());
        }//end while
    }//end main
    
}//end class
