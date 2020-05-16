import java.util.Scanner;

public class fib {
    public static long fibonacci(long x ){
        long num1 = 0;
        long num2 = 1;
        for (int y = 0; y < x/2; y++){
            num1 = num2 + num1;
            num2 = num1 + num2;
        }
        if (x % 2 == 0){
            return num1;
        }
        return num2;
    }
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Enter a number" );
        long x = pen.nextLong();
        pen.nextLine();
        System.out.println(fibonacci(x));
        pen.close();
    }
}
