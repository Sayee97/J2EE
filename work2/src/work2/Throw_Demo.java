 package work2;


 public class Throw_Demo {
     
     void a(int j){
         if(j<118){
             throw new ArithmeticException("Error IO exception");
         }
         else{
             System.out.println("Done!!!");
         }
     }
     public static void main(String[] args) {
         Throw_Demo d =new Throw_Demo();
         d.a(200);
         
     }
    
}
