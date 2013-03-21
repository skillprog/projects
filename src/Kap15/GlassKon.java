
package Kap15;
import java.util.*;

/*
 * @author Anton Karmeborg 
 */

public class GlassKon 
{
    public static void main(String[] args) 
    {
        LinkedList<String> glassKo = new LinkedList<String>();
        Scanner sc = new Scanner(System.in);
        char svar;
        boolean fortsatt = true;
        while(fortsatt){
        
        System.out.print("FÖRST I KÖN: ");
        
        if (glassKo.isEmpty()) {System.out.print("Ingen kö just nu");
        }else{
        for(String namn : glassKo){ System.out.print(namn + " ");
        }}
        
        System.out.println();
        System.out.println("Välj:");
        System.out.println("1. Lägg till ny person");
        System.out.println("2. Vem är först i kön?");
        System.out.println("3. Ta bort person");
        System.out.println("0. Avsluta");
        
        try{
        svar = sc.nextLine().charAt(0);
        
        switch (svar){
        case '1':
        System.out.print("Skriv ett namn: ");
        String namn = sc.nextLine();
        glassKo.addLast(namn);
        break;
        
        case '2':
        System.out.print("Först i kön: " + glassKo.getFirst());
        System.out.print(" (Tryck ENTER)"); sc.next();
        break;
            
        case '3':
        glassKo.removeFirst();
        System.out.println("eliminerar första personen från kön");
        System.out.println(" (Tryck ENTER)"); sc.next();
        
        case '0':
        fortsatt = false;
        System.out.println("SLUT");
        break;
        default :
        break;
        }//end switch
        }//end try
        
        catch(Exception e){}
        System.out.println();
        }//end while
    }//end main
}//end class