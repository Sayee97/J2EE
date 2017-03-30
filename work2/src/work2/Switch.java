/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;

import java.util.Scanner;

/**
 *
 * @author SAYEE
 */
public class Switch {
    public static void main(String[] args) {
         Scanner s = new Scanner(System.in);
          System.out.println("Enter ur age");
        int r=  s.nextInt();
        switch(r){
            case 1:
                System.out.println("Hey u clicked 1");
                break;
            case 2:
                System.out.println("Hey u clicked 2");
                break;
            default:
                System.out.println("Sorry no choice baby:P");
        }
    }
    
}
