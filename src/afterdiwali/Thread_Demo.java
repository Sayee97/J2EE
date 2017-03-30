/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;


public class Thread_Demo extends Thread {

    @Override
    public void run() {
        System.out.println("Current thread is:"+Thread.currentThread().getName());
    }
    
    
    public static void main(String[] args) {
        Thread_Demo td = new Thread_Demo();
        Thread_Demo td1 = new Thread_Demo();
        Thread_Demo td2 = new Thread_Demo();
        td.setName("Thread 1");
        td1.setName("Thread 2");
        td2.setName("Thread 3");
        td.start();
        td1.start();
        td2.start();
        
    }
    
}
