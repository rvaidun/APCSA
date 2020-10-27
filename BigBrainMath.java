public class BigBrainMath {
    public static void main(String[] args) {
        System.out.println(pow2(3));
        System.out.println(pow2(4));
        System.out.println(log2(64));
        System.out.println(log2(4));
    }
    public static int pow2(int x) {
        int q = 1;
        for(int i = 0; i<x; i++) {
            q = q*2;
        }
        return q;
    }

    public static int log2(int x) {
        int q = 0;
        for (;x > 1; x /= 2) {
            q++;
        }
        return q;
    }

}
