/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import com.sun.xml.internal.fastinfoset.util.CharArray;
import java.util.PriorityQueue;
import java.util.Comparator;

/**
 *
 * @author SAYEE
 */
class cust implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
//        Integer i1 = (Integer) o1;
//        Integer i2 = (Integer) o2;


        String s1 = o1.toString();
        String s2 = o2.toString();

        return s2.compareTo(s1);

    }

}

public class PQueue {

    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue(15, new cust());
        pq.offer("A");
        pq.offer("B");
        pq.offer("C");
        pq.offer("D");
        pq.offer("E");

//        System.out.println(pq.poll());
//        // System.out.println(pq.remove());
//        pq.offer(1);
//        pq.offer(2);
//        pq.offer(3);
//        pq.offer(4);
        //   pq.offer(5);
//        pq.add(1);
//        pq.add(2);
//        pq.add(3);
//        pq.add(4);
//        pq.add(5);
//        pq.add(6);
//        pq.offer(6);
//        pq.offer(7);
        System.out.println(pq);

    }

}
