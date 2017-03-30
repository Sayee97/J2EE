import java.util.Scanner;


class Swap{
public static void main(String args[]){
Scanner scn= new Scanner(System.in);
System.out.println("Enter integer value");
int a=scn.nextInt();
System.out.println("Enter another integer value");
int b=scn.nextInt();


System.out.println("Value before swapping is" + "a: "+a +" " +"b: " +b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("Value before swapping is" + "a: "+a +" " +"b: " +b);

}


}