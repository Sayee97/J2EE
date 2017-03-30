/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

/**
 *
 * @author SAYEE
 */
public class methodOverloading {
    public void m(){
        System.out.println("heyy this is sayee");
    
}
    public void m(int a){
        System.out.println("You just entered an integer"+a);
    }
    public void m(int a,int b){
        System.out.println("Addition of the numbers"+(a+b));
        
    }
    public void m(char a){
        System.out.println("character u entered is "+a);
    }
   public void m(byte a,float f){
       System.out.println("byte is "+a+" float is"+f);
   } 
    
    public  static void main(String[] args) {
        methodOverloading h = new methodOverloading();
        h.m();
        h.m(77);
        h.m(6, 80);
        h.m('p');
        h.m((byte)3, 0.0f);
    }
    
}
