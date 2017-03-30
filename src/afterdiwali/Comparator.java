/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.NavigableSet;
import java.util.TreeSet;

/**
 *
 * @author SAYEE
 */

class logic implements java.util.Comparator{

    @Override
    public int compare(Object o1, Object o2) {
     Integer i1=(int)o1;
     Integer i2=(int)o2;
//     if(i1<i2){
//         return 12;
//     }
//     else if(i1>i2){
//         return -12;
//     }
//     else
//         return 0;

//    }
    return -1;
}}

class Watson implements java.util.Comparator{

    @Override
    public int compare(Object o1, Object o2) {
     String i1=(String)o1;
     String i2=o2.toString();
//     if(i1<i2){
//         return 12;
//     }
//     else if(i1>i2){
//         return -12;
//     }
//     else
//         return 0;

//    }
    return -i1.compareTo(i2);
}}




//i1.compareTo(i2)normal
//-i1.compareTo(i2)descending
//return +1;jese dala vesa
//return -1;last dala wo first
//return 0;normal
public class Comparator {
    public static void main(String[] args) {
        TreeSet ss = new TreeSet(new logic());
        ss.add(100);
        ss.add(12);
        ss.add(12);
        ss.add(44);
        ss.add(77);
        System.out.println(ss);
          TreeSet ss1 = new TreeSet(new Watson());
        ss1.add("Cat");
        ss1.add("Sayee");
        ss1.add("watson");
        ss1.add("zambo");
        ss1.add("rambo");
        System.out.println(ss1);
         
    
        
    }
  
    
}
