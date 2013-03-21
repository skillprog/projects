/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Kap1;



/**
 *
 * @author ankg01
 */
public class Support {
    
    public double minst(double tal1, double tal2) {
        double talet;
        if (tal1 < tal2){
    talet = tal1;
    }
        else{
        return tal2;
        } 
            
        return talet;    
        
        }//end public void
    
    public double arean(double radie, double pi){
        
        double area = pi*radie*radie;
        
        return area;
    }//end omkrets
    
    public double omkretsen(double radie, double pi){
  
        double omkrets = 2*pi*radie;
        
        return omkrets;
    }//end area
    
    public boolean berakna(double hojd, double ms){
        boolean result;
        
    if (hojd >= 7.92 && ms <= 2) {            
        result = true;
        return result;
    }//end if
    
    else{
        return false;      
    }//end else
         
    }//end boolean
    
    public boolean rekordet(double hopp, double vind){
            boolean rekord;
        
             if (hopp > 7.92 && vind <= 2.0){
                 rekord = true;
                 return rekord;
             }//end if
        
             else{
             return false;
             }//end false 
             
    }//end boolean
    
}//end class


