/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.Vector;

/**
 *
 * @author SAYEE
 */
public class vector_demo {

    public static void main(String[] args) {
        Vector v = new Vector();
        v.add("sameep");
        v.add(9.7);
        v.addElement(8);
        v.add("sameep");
        v.add(9.7);
        v.addElement(8);
        v.add("sameep");
        v.add(9.7);
        v.addElement(8);
        v.add("sameep");
        v.add(9.7);
        v.addElement(8);

        System.out.println(v);

        System.out.println(v.capacity());
        Vector r =new Vector(5,6);
          r.add("sameep");
        System.out.println(r);
       
        

    }

}
