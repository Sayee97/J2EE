/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package afterdiwali;

import java.util.Scanner;

/**
 *
 * @author SAYEE
 */
public class Array {
    public static void main(String[] args) {
        int a[],i;
        Scanner b  = new Scanner(System.in);
        a=new int[5];
        System.out.println("Please enter data");
        for(i=0;i<5;i++){
            a[i]=b.nextInt();
        }
        for (int j = 0; j < a.length; j++) {
            System.out.println(a[j]);
            
        }
        
    }
}
