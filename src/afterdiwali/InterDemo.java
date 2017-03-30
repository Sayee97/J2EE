/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

interface car{
    int interest();
    void carName();
    int cost();
    
}
abstract class help implements car{
     @Override
     public int interest(){
       return 0;  
     }
     @Override
    public void carName(){
        
    }
     @Override
    public int cost(){
        return 0;
    }

}
 class bmw1 extends help{
    @Override
    public int interest(){
        return 17;
    }
       @Override
    public void carName(){
           System.out.println("BMW");
        
    }
     @Override
    public int cost(){
        return 200;
    }
}
 class audi1 extends help{
    @Override
    public int interest(){
        return 22;
    }
       @Override
    public void carName(){
           System.out.println("AUDI");
        
    }
     @Override
    public int cost(){
        return 500;
    }
}
 class honda1 extends help{
    @Override
    public int interest(){
        return 26;
    }
       @Override
    public void carName(){
           System.out.println("HONDA");
        
    }
   
}

public class InterDemo {
    public static void main(String[] args) {
        bmw1 r1=new bmw1();
        r1.carName();
        System.out.println( r1.interest());
        System.out.println( r1.cost());
        System.out.println("*************************");
        
        
         audi1 r=new audi1();
        r.carName();
        System.out.println( r.interest());
        System.out.println( r.cost());
        System.out.println("*************************");
         honda1 r33=new honda1();
         
         
        r33.carName();
        System.out.println( r33.interest());
        System.out.println( r33.cost());
        System.out.println("*************************");
        
    }
   
    
}
