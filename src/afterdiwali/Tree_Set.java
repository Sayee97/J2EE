/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 *
 * @author SAYEE
 */
public class Tree_Set {
    
    
    
    



    public static void main(String[] args) {
        System.out.println("Sameep");
        
        SortedSet ss = new TreeSet();
        //ss.add("sameep");
     
        ss.add("aaa");
        ss.add("bbb");
        ss.add("ccc");
        ss.add("ddd");
        ss.add("eee");
        ss.add("fff");
               
       
        
        System.out.println(ss);
        System.out.println(ss.first());
        System.out.println(ss.last());
        System.out.println(ss.headSet("ccc"));
        System.out.println(ss.tailSet("ccc"));
        System.out.println("****************************");
        TreeSet t = new TreeSet(ss);
        //System.out.println(t);
        t.add("watson");
        System.out.println(t);
        NavigableSet nn = new TreeSet();
        nn.add("sameep");
        nn.add("watson");
        nn.add("zambo");
        nn.add("ashna");
        nn.add("babe");
        System.out.println(nn);
        System.out.println(nn.pollFirst());
        System.out.println(nn.pollLast());
        System.out.println(nn);
               System.out.println(nn.higher("zambo"));
               System.out.println(nn.lower("zambo"));
    }
}

    

