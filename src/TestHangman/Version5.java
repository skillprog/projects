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
public class Version5 {
    
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            String hemligtOrd = "programmera";// Sträng deklarerad med hemliga ordet
            StringBuilder frageTeckenLista = new StringBuilder();//frågeteckenlistan
            int Liv = 6;//antal liv vid start
            boolean antalLiv;//påvisar med true eller false om liv reduceras
            boolean ordRatt = false;//bestämmer vilken text som skrivs ut om du vann eller förlorade

            for (int i = 0; i < hemligtOrd.length() ; i++) 
            {
                frageTeckenLista.append('?');
            }//end for

            while(Liv > 0 && ordRatt == false)
            {
                antalLiv = false;
                System.out.println(frageTeckenLista.toString());

                System.out.println("Gissa på en bokstav: ");
                char gissadBokstav = sc.next().charAt(0);
                gissadBokstav = Character.toLowerCase(gissadBokstav);

                for (int i = 0; i < hemligtOrd.length(); i++) 
                {
                    if(hemligtOrd.charAt(i) == gissadBokstav)
                    {
                        frageTeckenLista.setCharAt(i, gissadBokstav);
                        antalLiv = true;
                    }//end if

                }//end for                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   

                if(antalLiv == false)
                {
                    Liv--;
                }

                if(hemligtOrd.equals(frageTeckenLista.toString()))
                {
                    ordRatt = true;
                }
                
                System.out.println("du har :" + Liv + " liv kvar");
            }//end while
            System.out.println(frageTeckenLista.toString());
            
            ordRatt = !hemligtOrd.equals(frageTeckenLista.toString());
            
            if(ordRatt == false){
                System.out.println("Grattis du klara det");
            }else{
                System.out.println("Du det där var inte bra");
            }
            
            System.out.println("Det hemliga ordet var :" + hemligtOrd);
    }//end main
    
}//end class
