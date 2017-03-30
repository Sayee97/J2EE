/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author SAYEE
 */
public class HMAP {

    public static void main(String[] args) {
        HashMap u = new HashMap();
        u.put(0, "Sameep");
        u.put(3, 'c');
        u.put(18, "walmik");
        u.put(4, "Quora");
        u.put(5, "Sayee");
        HashMap o = new HashMap(u);
        System.out.println(u);
        //System.out.println(o);
        u.replace(3, 'c', "Shantanu");
        System.out.println(u);
        //.putAll(u);
        System.out.println(u);
        u.size();
        System.out.println(u.size());
        System.out.println(u.get(3));
        HashMap w = new HashMap();
        w.putAll(o);
        System.out.println(w);
        HashMap r = new HashMap(15, 0.23f);
        r.put(1, "Sammm");
        r.put(2, "shant");
        r.put(3, "santosh");
        r.get(1);
        System.out.println("*********************");
        System.out.println(r.get(1));
        // System.out.println(r.get);
        // System.out.println(r.);
        System.out.println("***********SAYEE*********");
        //Set s = r.entrySet();
        java.util.Set S = r.entrySet();
        Iterator itr = S.iterator();

        while (itr.hasNext()) {
            Map.Entry m = (Map.Entry) itr.next();
            System.out.println(m.getKey() + " " + m.getValue());
            if (m.getKey().equals(1)) {
                m.setValue("Shane Watson");
            }

        }
        System.out.println(r);

    }
}
