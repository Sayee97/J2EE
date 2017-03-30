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
public class Wrapper {
    public static void main(String[] args) {
        Integer in = new Integer(10);
        System.out.println(in);
        System.out.println(in.toString());
        
        
        Integer in1 = new Integer("899");
        System.out.println(in1);
        System.out.println(in1.toString());
        
        System.out.println(in+in1);
        System.out.println(in.toString()+in1);
        int i2 = in1.intValue();
        System.out.println(i2);
                
                String s = "144";
                int u = Integer.parseInt(s);
                System.out.println(u);
                String s1 = "SAMEEP";
              String w2 = new String(s1.concat("manuuuuu"));
                System.out.println(w2);
                        Runtime rt = Runtime.getRuntime();
                        System.out.println(rt);
                        
                
                
        
    }
    
}
