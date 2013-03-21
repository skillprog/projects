/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap15;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class LankadLista {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        ArrayList<String> namnLista = new ArrayList<>();
        int valet = 1;
        
        while(valet != 0){
            
            if(namnLista.isEmpty()){
                System.out.println("Listan är tom");
            }else{
                for (int i = 0; i < namnLista.size(); i++) {
                    System.out.println(i + ". " + namnLista.get(i));
                }//end for
            }//end else
        System.out.println("Dina val");
        System.out.println("");
        System.out.println("1. Fyll listan med namn");
        System.out.println("2. Lägg till ett namn");
        System.out.println("3. Lägg till ett namn på en viss plats");
        System.out.println("4. Se element nummer");
        System.out.println("5. Ta bort element nummer");
        System.out.println("6. Ta bort ett namn");
        System.out.println("7. Ta bort alla");
        System.out.println("0. Avsluta");
        
        valet = sc.nextInt();
        
        switch(valet){
        
            case 1:
                char laggTillNamn = 'n';
                System.out.println("Val 1");
                do {
                    System.out.print("Ange namnet: ");
                    String namn = sc.next();
                    namnLista.add(namn);
                    System.out.print("Vill du du lägga till ett ett till namn? (j/n)");
                    laggTillNamn = sc.next().charAt(0);
                    System.out.println("");
                } while (laggTillNamn == 'j' || laggTillNamn == 'J');
                System.out.println("");
                break;
            
            case 2:
                System.out.println("Skriv ett namn: ");
                String namn = sc.next();
                if(namn.equals("")){
                    namnLista.add(namn);
                }
                break;
            
            case 3:
                System.out.println("Val 3");
                break;    
            
            case 4:
                System.out.println("Val 4");
                break;    
            
            case 5:
                System.out.println("Val 5");
                break;
            
            case 6:
                System.out.println("Val 6");
                break;
                
            case 7:
                System.out.println("Nu töms listan");
                namnLista.clear();
                break;
                
            case 0:
                System.out.println("Val 0");
                System.out.println("Hejdå");
                valet = 0;
                break;    
                
            default:
                System.out.println("Felaktig inmatning");
        }//end switch    
        
        }//end while
        
    
    }//end main
}//end class
