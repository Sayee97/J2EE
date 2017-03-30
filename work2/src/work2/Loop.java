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
public class Loop {
    Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
          Scanner s = new Scanner(System.in);
        int i,j,k,space=25,tent=25;
        System.out.println("Enter the value ");
       j=s.nextInt();
        
        for(i=0;i<j;i++){
            for(k=space;k>0;k--)
                System.out.print(" ");
            space--;
            for(k=0;k<i;k++){
                System.out.print("* ");
            }
            System.out.println("");
            
        }
        
        
    }
    
}
