/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.LinkedList;

/**
 *
 * @author SAYEE
 */
public class LInked_List {

    public static void main(String[] args) {
        LinkedList m = new LinkedList();
        m.add(0, "Sameep");
        m.add(1, "Virat");
        m.add(2, "Sehwag");
        m.add(3, null);
        m.add(4, 35);
        m.add(5, 9.89);

        m.addFirst("sam");
        m.addLast(9.6);
        System.out.println(m.getFirst());
        System.out.println(m.getLast());
        m.set(1, "mukta");
        System.out.println(m);
        LinkedList k = new LinkedList();

        k.add(0, "Sameep");
        k.add(1, "manu");
        m.add(k);
        System.out.println(m);
        // m.peekLast();

        System.out.println(m.peekLast());
        System.out.println(m.getLast());

        System.out.println(m.contains("samiii"));

    }
}
