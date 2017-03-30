package afterdiwali;

import java.util.Scanner;

public class MultidimensionalArray {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        //int a[][] = new int[3][3];
        int p,q;
        p=0;
        q=0;
        System.out.println("Enter the numberof rows");
p=s.nextInt();
int a[][]=new int[p][];
        
        // System.out.printl12n("PLEASE ENTER DATA");
        for (int i = 0; i < p; i++) {
            System.out.println("Enter column");
            q=s.nextInt();
            a[i]=new int[q];
            for (int j = 0; j < q; j++) {
                System.out.println("Enter d Value..." + i + " " + j);
                a[i][j] = s.nextInt();

            }

        }
        for (int i = 0; i < p; i++) {
            for (int j = 0; j < q; j++) {
                System.out.print(a[i][j] + "  ");

            }
            System.out.println(" ");
        }
        //------------FOR EACH LOOPPPPP------------------------------------
        //for(int[] is:a){
  //  for(int i:is){
    //    System.out.println(i);
   // }
    //}

    }
}
