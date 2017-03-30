package work2;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Throws_Demo {

    void a() throws IOException {
        throw new IOException("Showing u the error tada!");
    }

    void b() throws IOException{
        a();
    }
    void c(){
        try {
            //System.out.println("bla bla bla");
            a();
        } catch (Exception ex) {
           ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        Throws_Demo t = new Throws_Demo();
        t.c();

    }

}
