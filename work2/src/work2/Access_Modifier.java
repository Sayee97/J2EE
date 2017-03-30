package work2;

public class Access_Modifier {
    final int i=70;
    void add(){
        int i=30;
        int j=90;
        i=i+j;
        System.out.println("The addition is : "+i);
    }
    public static void main(String[] args) {
        Access_Modifier t = new Access_Modifier();
        t.add();
       // System.out.println(t.i=67);
       //CANNOT MODIFY VALUE OF FINAL!!!!!!!!!!!
        System.out.println(t.i);
    }
    
}
