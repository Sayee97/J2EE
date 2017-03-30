/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;

/**
 *
 * @author SAYEE
 */
public class Custom_Exception extends Exception{
        
    } 
    

class g extends Exception{
   static void a() throws Custom_Exception{
        throw new Custom_Exception();
        
    }
    public static void main(String[] args) throws Custom_Exception{
        a();
    }
    
    
}
