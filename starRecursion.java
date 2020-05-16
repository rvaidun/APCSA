public class starRecursion {
    public static void stars(int n) {
        if (n == 0)
        System.out.println();
        else {
            for(int i = 0; i < n; i ++) {
                System.out.print("*");
            }
            System.out.println();
            stars(n-1);
            for(int i = 0; i < n; i ++) {
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        stars(3);
    }
}
