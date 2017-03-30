package afterdiwali;

import java.util.Enumeration;
import java.util.Stack;

/**
 *
 * @author SAYEE
 */
public class Cursors_Demo {

    public static void main(String[] args) {
        Stack st = new Stack();
        st.add("220");
        st.add(300);
        st.push(6.7);
        st.push("sameep");
        System.out.println(st);
        st.pop();
        System.out.println(st);
        Enumeration e = st.elements();

        System.out.println(e.hasMoreElements());
        while (e.hasMoreElements()) {
            System.out.print(e.nextElement());
        }

    }

}
