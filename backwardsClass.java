public class backwardsClass {
    public static void backwards(int n) {
        if (n == 0)
            System.out.print("");
        else{
            System.out.print(n%10);
            backwards(n/10);
            System.out.print(n%10);
        }
    }

    public static void main(String[] args) {
        backwards(1234);
    }
}
