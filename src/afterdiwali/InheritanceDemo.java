/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;
class gp{
    public void m(){
        System.out.println("yo me dadaji huuu");
    }
}
class parent extends gp{
    int i=80;
    public void parentmethod(){
      //  parent s = new parent();
        //s.m();
        System.out.println("-----Parent class-----");
    }
}
class child extends parent{
    int i=78;
    public void childmethod(){
        System.out.println("----CHILD CLASS------");
        System.out.println(this.i);
        System.out.println(super.i);
        
    }
    public void parentmethod(){
        child s = new child();
        s.m();
        System.out.println("i am in childs method with same name");
    }
}
public class InheritanceDemo {
    //int j=90;
    public static void main(String[] args) {
        
      child m = new child();
   m.childmethod();
      m.parentmethod();
      gc j = new gc();
      j.m();
      j.q();
    }
    
}
 class gc extends gp{
    public void q(){
        System.out.println("I am the grandchild and extended gp");
    }
      public void m(){
        System.out.println("yo me dadaji ka potha huuu");
    }
 }