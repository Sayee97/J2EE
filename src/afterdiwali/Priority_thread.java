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
public class Priority_thread extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() +"  " +currentThread().getPriority());
    }

    public static void main(String[] args) {
        Priority_thread t = new Priority_thread();
        Priority_thread t1 = new Priority_thread();
        Priority_thread t2 = new Priority_thread();
        t.setName("First thread babe");
        t1.setName("second thread babe");
        t2.setName("third thread babe");
        t.setPriority(MIN_PRIORITY);
        t1.setPriority(MAX_PRIORITY);
        t2.setPriority(NORM_PRIORITY);
        //  t2.setPriority(MIN_PRIORITY);
        t.start();
        t2.start();
        t1.start();

    }

}
