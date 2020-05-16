
import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner pen  = new Scanner(System.in);
        System.out.println("Enter a number to find square root");
        int num = pen.nextInt();
        primeFactorization(num);
        pen.close();


    }
    public static void primeFactorization(int x){
        int out = 1;
        int in = 1;
        if (x <= 1) {
            System.out.println(x);
            return;
        }
        for (int i = 2; i<=(x/i); i++) {
            int count = 0;
            while (x % i == 0) {
                x /= i;
                count++;
                if (count==2){
                    count = 0;
                    out *=i;
                }
            }
            if (count == 1) {
                in*=i;
            }

        }
        in*=x;
        System.out.println((out==1?"":out) + (in==1?"": "\u221A" + in));

    }
}

