/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package TestHangman;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class Version6 {
    
    
    public static void main(String[] args) 
    {
            Scanner sc = new Scanner(System.in);
            String hemligtOrd = "programmera";// Sträng deklarerad med hemliga ordet
            String[] hemligaOrdListan = 
            {
            "abstract",
            "assert",
            "boolean",
            "break",
            "byte",
            "case",
            "catch",
            "char",
            "class",
            "const",
            "continue",
            "do",
            "double",
            "else",
            "enum",
            "extends",
            "final",
            "finally",
            "float",
            "for",
            "goto",
            "if",
            "implements",
            "import",
            "instanceof",
            "int",
            "interface",
            "long",
            "native",
            "new",
            "package",
            "private",
            "protected",
            "public",
            "return",
            "short",
            "static",
            "strictfp",
            "super",
            "switch",
            "synchronized",
            "this",
            "throw",
            "throws",
            "transient",
            "try",
            "void",
            "volatile",
            "while"
            };
            Random slump = new Random();//anropar random klassen
            int slumptal = slump.nextInt(hemligaOrdListan.length);//slumpar ett tal från listans storlek
            hemligtOrd = hemligaOrdListan[slumptal];//hämtar ett slumpat ord från listan
            StringBuilder frageTeckenLista = new StringBuilder();//frågeteckenlistan
            int Liv = 6;//antal liv vid start
            boolean koll;//påvisar med true eller false om liv reduceras
            boolean ordRatt = false;//bestämmer vilken text som skrivs ut om du vann eller förlorade
            StringBuilder felaktigaTecken = new StringBuilder();
            
            for (int i = 0; i < hemligtOrd.length() ; i++) 
            {
                frageTeckenLista.append('?');
            }//end for

            while(Liv > 0 && ordRatt == false)
            {
                koll = false;
                System.out.println(frageTeckenLista.toString());

                System.out.println("Gissa på en bokstav: ");
                char gissadBokstav = sc.next().charAt(0);
                gissadBokstav = Character.toLowerCase(gissadBokstav);

                for (int i = 0; i < hemligtOrd.length(); i++) 
                {
                    if(hemligtOrd.charAt(i) == gissadBokstav)
                    {
                        frageTeckenLista.setCharAt(i, gissadBokstav);
                        koll = true;
                    }//end if

                }//end for                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             
               
                if(koll == false)
                {
                    Liv--;
                    felaktigaTecken.append(gissadBokstav);
                }

                if(hemligtOrd.equals(frageTeckenLista.toString()))
                {
                    ordRatt = true;
                }
                System.out.println("");//avstång
                System.out.println("felaktiga tecken: " + felaktigaTecken.toString());
                System.out.println("du har :" + Liv + " liv kvar");
                
                switch(Liv){
                
                    case 5: System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                        break;
                    
                    case 4: System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                        break;
                    
                    case 3: System.out.println("          ===============");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                        break;
                        
                    case 2: System.out.println("          ===============");
                            System.out.println("          || //");
                            System.out.println("          ||//");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                        break;
                        
                    case 1: System.out.println("          ===============");
                            System.out.println("          || //         |");
                            System.out.println("          ||//          |");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");
                        break;
                    
                    case 0: System.out.println("          ===============");
                            System.out.println("          || //         |");
                            System.out.println("          ||//          |");
                            System.out.println("          ||          ('-')");
                            System.out.println("          ||           -|-");
                            System.out.println("          ||           / \\");
                            System.out.println("          ||");
                            System.out.println("          ||");
                            System.out.println("    XXXXXXXXXXXXX");
                            System.out.println(" XXXXXXXXXXXXXXXXXXXX");
                            System.out.println("XXXXXXXXXXXXXXXXXXXXXX");       
                        break;
                }//end switch
                
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
