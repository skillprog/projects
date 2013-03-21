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
public class HashTest {
 
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Hashtable<String, String> ht = new Hashtable<String, String>();
        String land;
        
        ht.put("Danmark", "Köpenamn");
ht.put("Sverige", "Stockholm");
ht.put("Norge", "Oslo");
ht.put("Ryssland", "Moskva");
ht.put("Tyskland", "Berlin");
ht.put("Finland", "Helsingfors");
ht.put("Frankrike", "Paris");
System.out.println("Land? ");
land = sc.nextLine();
while(!land.equals("#")){
        System.out.println("Huvudstad: " + ht.get(land));
        System.out.println("Land? ");
        land = sc.nextLine();
        }//end while
    }//end main
    
}//end class
