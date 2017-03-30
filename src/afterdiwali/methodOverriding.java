/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;
class RBI{
    public void pese(){
        System.out.println("ehhee m in RBI agent");
    }
}
class HDFC extends RBI{

    @Override
    public void pese() {
        System.out.println("heyya m frm hdfc bank");
    }
    
}
 class parent1{
        public void Car(){
            System.out.println("MY BASE CAR!!!");
            
            
        }
    }
    class child1 extends parent1{
        public void audi(){
            System.out.println("hey m audi");
        }
        @Override
        public void Car(){
            System.out.println("m audi inside child1");
        }
    }

public class methodOverriding {
    public static void main(String[] args) {
        child1 t = new child1();
        t.Car();
        t.audi();
        parent1 y = new child1();
        y.Car();
        System.out.println("---------------------------------");
        HDFC n = new HDFC();
        n.pese();
        
    }
   
    
}
