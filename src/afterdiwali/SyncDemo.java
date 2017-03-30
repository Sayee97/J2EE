package afterdiwali;

import java.util.logging.Level;
import java.util.logging.Logger;

class Display{
  synchronized void disp(int n){
       for (int i = 0; i < 3; i++) {
           System.out.println("The on going int is"+n*i);
           try {
               Thread.sleep(100);
           } catch (InterruptedException ex) {
               Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
           }
       }
   
    
}}
   class test1 extends Thread{
       Display d;
       public test1(Display y){
           d=y;
           
       }

        @Override
        public void run() {
           d.disp(1);
        }
       
       
   }



 class test2 extends Thread{
       Display d;
       public test2(Display y){
           d=y;
           
       }

        @Override
        public void run() {
           d.disp(3);
        }
       
       
   }






public class SyncDemo {
    public static void main(String[] args) {
        Display ex = new Display();
        test2 r = new test2(ex);
        test1 j = new test1(ex);
        r.start();
        j.start();
    }
}
