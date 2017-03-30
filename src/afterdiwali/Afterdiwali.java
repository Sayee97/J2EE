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
public class Afterdiwali {
    protected void add(){
        int a,b,c;
        a=80;
        b=90;
        c=a+b;
        System.out.println("The addition is:" +c);
        
    }
    private void m(){
        System.out.println("hey sam");
    }

     public static void main(String[] args) {
        Afterdiwali b = new Afterdiwali();
        b.m();
        b.add();
    }
    
}
