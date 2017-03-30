/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package work2;

import java.util.Scanner;


public class if_else {
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
          System.out.println("Enter ur age");
        int r=  s.nextInt();
          if(r>18)
              System.out.println("you are eligible to vote");
          else
              System.out.println("You are not eligible to vote");
    }
    
}
