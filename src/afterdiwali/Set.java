/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 *
 * @author SAYEE
 */
public class Set {

    public static void main(String[] args) {
        HashSet hs1 = new HashSet();
        hs1.add(10);
        hs1.add("Sameep");
        hs1.add(7.89);
        hs1.add("String :)");
        System.out.println(hs1);
        System.out.println(hs1.size());
        
        HashSet hs2 = new HashSet(hs1);
        hs2.add(35);
        System.out.println(hs2);
        Iterator i = hs1.iterator();
        while(i.hasNext()){
            System.out.print(i.next()+" ");
        }
        System.out.println(" ");
        hs1.remove(7.89);
        System.out.println("***************************");
        LinkedHashSet ll = new LinkedHashSet(hs1);
        System.out.println(ll);
        ll.add(756);
        ll.add("Watson");
        ll.add('C');
        System.out.println(ll);
       // ll.add('C');
       
        
        
    }

}
