package afterdiwali;

import java.util.SortedSet;
import java.util.TreeSet;

public class Set_1 {

    public static void main(String[] args) {
        System.out.println("Sameep");
        
        SortedSet ss = new TreeSet();
        ss.add("sameep");
        ss.add(78);
        ss.add("santosh");
        ss.add(9.78);
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet(ss));
        System.out.println(ss.tailSet(ss));
               
    }
}
