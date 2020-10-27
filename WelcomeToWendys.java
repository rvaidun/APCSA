public class WelcomeToWendys {
    public static void main(String[] args) {
        int x = 5;
        int a = 2;
        whatItDo("" + x); // PRINTS:________________________
        whatItDo("" + a); // PRINTS:________________________
        x = fourFor4(a);
        a = fourFor4(x);
        whatItDo("" + x); // PRINTS:________________________
        whatItDo("" + a); // PRINTS:________________________
        a = jrBaconator(a);
        x = fourFor4(x);
        whatItDo("" + x); // PRINTS:________________________
        whatItDo("" + a); // PRINTS:________________________
    }
    public static int fourFor4(int a) {
        return a * a;
    }
    public static int jrBaconator(int b) {
        int q = 0;
        for (int i = 1; i < b; i++) {
            q = q + i;
        }
        return q;
    }
    public static void whatItDo(String babyyy) {
        System.out.println(babyyy);
    }
}