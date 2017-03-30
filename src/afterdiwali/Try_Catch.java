/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

/**
 *
 * @author SAYEE
 */
public class Try_Catch {
    public static void main(String[] args) {
        try{
            int i=9/0;
            
            try{
                String s=null;
            }
            catch(Exception e){
                System.out.println("NULL pointer exception");
            }
               try{
                int j[]=new int[5];
                j[5]=78;
            }
            catch(Exception e){
                System.out.println("Array index out of exception");
            }
                  try{
                String s=null;
                
            }
            catch(Exception e){
                System.out.println("NULL pointer exception");
            }
        }
        catch(Exception ep){
            ep.printStackTrace();
            //System.out.println("SAyeeee");
        }
       
        
        try{
            String s1="sameep";
            int i2=Integer.parseInt(s1);
            
        }
        catch(Exception a){
          System.out.println("yooo");
           // a.printStackTrace();
        }
    }
    
}
