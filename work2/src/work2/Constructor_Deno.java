/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;

/**
 *
 * @author SAYEE
 */
public class Constructor_Deno {
    int no;
    String name;
    //Passing constructor as reference
    public Constructor_Deno(Constructor_Deno e){
        this.no=e.no;
        this.name=e.name;
    }
    //Chaining constructors
    public Constructor_Deno(int no,String name){
        this.name=name;
        this.no=no;
    }
    //chaining constructors
    public Constructor_Deno(int o){
        this.no=o;
        System.out.println("NUMBER is:"+o);
    }
    public void display(){
        System.out.println(no+"...\nName is "+name);
        
    }
    public static void main(String[] args) {
        Constructor_Deno cd = new Constructor_Deno(56, "Sayee");
             Constructor_Deno cd2 = new Constructor_Deno(56);
        cd.display();
        Constructor_Deno cd3 = new Constructor_Deno(cd);
        cd3.display();
        
    }
    
}
