/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;

  
public class private_modifier {
     private void add(){
        int i=30;
        int j=90;
        i=i+j;
        System.out.println("The addition is : "+i);
    }
     
    public static void main(String[] args) {
        private_modifier t= new private_modifier();
        t.add();
    }
}
//class m{
//    public static void main(String[] args) {
//        private_modifier t= new private_modifier();
//        t.add();
//    }
//}  
//PRIVATE KA DUSRE CLASS ME NAI!!!!
