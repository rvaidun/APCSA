package ifacerror;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class erorz {
    public static void arithmetic(int x){
        if (x == 0) {
            throw new ArithmeticException("x cannot be negative");
        }
        System.out.println(9/x);

    }
    public static void nullPointerException() {
        String s = null;
        if (s == null){
            throw new NullPointerException("s cannot be null");
        }
        s.toString();
    }
    public static void classcast(){
        Object o = new Integer(42);
        if (o instanceof Integer){
            throw new ClassCastException("object cannot be an integer");
        }
        String s = (String) o;
    }
    public static void arrayindexOutOfBoundsException(int x ) {
        if (x < 0) {
            throw new ArrayIndexOutOfBoundsException("x needs to be positive");
        }
        int s[] = new int[5];
        System.out.println(s[x]);
    }
    public static void indexoutofbounds(int x) {
        ArrayList<String> y = new ArrayList<String>();
        if (x == 6) {
            System.out.println("x cannot be 6");
        }
        y.get(x);
    }

    public static void illegalargument(int x) {
        if (x < 0){
            throw new IllegalArgumentException("X cannot be negative");
        }
        System.out.println(x);
    }


    public static void main(String[] args) {

    }
}
