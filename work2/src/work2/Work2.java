
package work2;

 

class abc{
    void m2(){
        System.out.println("HELLO ABC FIRST METHOD");
        
    }
    void m4(){
        System.out.println("HELLO ABC 2nd METHOD");
    }
}
public class Work2 {

   void m1(){
      
   
       System.out.println("Hey this is method with no parameters");
       
   }
     void m1(char c){
       System.out.println("Hey this is method with char as parameter"+c);
       
   }
       void m1(int i){
       System.out.println("Hey this is method with integer parameters"+i);
       
       
   }
        void m1(int i,int j){
            int c;
            c=i+j;
       System.out.println("Hey this is method with adding 2 integers: "+c);
       
       
   }
        static void m2(){
            System.out.println("Hey method with static keyworfd");
        }
        void m4(abc z){
           z=new abc();
            z.m2();
            z.m4();
        }
    public static void main(String[] args) {
       Work2 w = new Work2();
       w.m1();
       w.m1('S');
       w.m1(56);
       w.m1(35, 68);
       m2();
       abc k= new abc();
    w.m4(k);
        System.out.println("**************************");
        System.out.println("END OF PROGRAM");
        System.out.println("**************************");
    
}
}