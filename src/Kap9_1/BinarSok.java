/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap9_1;

import java.util.Scanner;

/**
 *
 * @author ankg01
 */
public class BinarSok 
{
    
    public static void main(String[] args) 
    {
        //deklaration
        Scanner sc = new Scanner(System.in);
        int[] arr = {3, 5, 7, 9, 11, 13, 15, 17, 19, 21, 23, 25};
        int max, min, t, pos, mitten;
        min = 0;
        max = arr.length -1;
       
        //inmatningar
        System.out.println("Vilket heltal söker du? ");
        t = sc.nextInt();
        pos = -1;
        
        while(min <= max && pos == -1){
            mitten = (max + min)/2;
            if(t > arr[mitten]){
                min = mitten +1;
            }else if(t < arr[mitten]){
                max = mitten -1;
            }else{
                pos = mitten;
            }//end else
        
                
            if(pos == -1){
                System.out.println("Talet hittades inte");
            }else{
                System.out.println("Talet finns i element " + pos);
            }//end else          
        }//end while
    }//end main
}//end class







