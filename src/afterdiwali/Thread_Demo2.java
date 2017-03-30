/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SAYEE
 */
public class Thread_Demo2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.print(Thread.currentThread().getName());
            try {
                Thread.sleep(40);
            } catch (InterruptedException ex) {
                Logger.getLogger(Thread_Demo2.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public static void main(String[] args) throws Exception {
        Thread_Demo2 td = new Thread_Demo2();

        Thread t1 = new Thread(td);
        Thread t2 = new Thread(td);
        Thread t3 = new Thread(td);
        Thread t4 = new Thread(td);
        Thread t5 = new Thread(td);
        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");
        t4.setName("T4");
        t5.setName("T5");

        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();
        t5.start();

    }

}
