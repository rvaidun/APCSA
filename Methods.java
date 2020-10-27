package APCS;

public class Methods {

    public static int factorial(int x) {
        int z = 1;
        for (int i = 1; i <= x; i++) {
            z = z*i;
        }
        return z;
    }

    public static int exp(int base, int exp) {
        int ans = 1;
        for(int i = 0; i<exp; i++) {
            ans = ans*base;
        }
        return ans;
    }

    public static int log2(int x) {
        //log base 2 of x = ans
        return (int) (Math.log(x) / Math.log(2));
    }

    public static String backwards(String stg) {
        String kb = "";
        for (int i = stg.length() - 1; i >= 0; i--) {
            kb = kb + stg.charAt(i);
        }
        return kb;
    }

    public static String oddlyBackwards(String s){
        String back = backwards(s);
        String ans = "";


        for(int i = 0; i < back.length(); i+=2) {
            ans = ans +  (back.charAt(i));
        }
        return  ans;
    }

    public static String doublestr(String s) {
        String ans = "";
        for(int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                ans = ans + s.charAt(i);
            }
            else {
                ans = ans + s.charAt(i) + s.charAt(i);
            }
        }
        return ans;
    }




    public static void main(String[] args) {
//        System.out.println(factorial(5));
//        System.out.println(exp(4,2));
//        System.out.println(log2(32));
        System.out.println(backwards("hello there"));
        System.out.println(backwards("general kenobi"));
        System.out.println(doublestr("you are a bold one"));
        System.out.println(doublestr("so uncivilized"));
        // Prints: ssoo uunncciivviilliizzeedd
    }
}
