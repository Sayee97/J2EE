package afterdiwali;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.RandomAccess;

/**
 *
 * @author SAYEE
 */
public class Array_List {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add("Sayee");
        al.add(134);
        al.add(7.85);
        al.add('s');
        al.add(null);
        System.out.println(al.size());
        System.out.println(al);
        al.add(1, "Swati");
       
        ArrayList a3 = new ArrayList();
        a3.add("manu");
      a3.add(139);
       a3.add(9.85);
       a3.add('c');
       a3.addAll(2, al);
        System.out.println(a3);
        System.out.println(al.isEmpty());
        System.out.println(al.get(2));
        System.out.println(al.indexOf("Sa"));
        
        System.out.println(al);
        
        LinkedList ll = new LinkedList();
        //ll.add("sameep");
        System.out.println(ll instanceof Serializable);
        System.out.println(ll instanceof Cloneable);
        System.out.println(ll instanceof RandomAccess);
         System.out.println(al instanceof Serializable);
        System.out.println(al instanceof Cloneable);
        System.out.println(al instanceof RandomAccess);
        
        
                
    
        
    }

}
