//Rahul Vaidun
//Period 3
package Project;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Which prime number would you like to find");
        int y = pen.nextInt();
        int primenumber = nthprimenumber(y);
        System.out.println(primenumber);
        pen.close();
    }
    public static boolean primecheck(int num) {
        int maxLoop = num;
        for (int i = 3; i < maxLoop; i+=2) {
            if (num % i == 0) {
                return false;
            }
            maxLoop=num/i;
        }
        return true;
    }
    public static int nthprimenumber(int x){
        int count = 1;
        int highestprime = 2;
        int number = 3;
        while (count < x){
            if(primecheck(number)){
                highestprime = number;
                count++;
                number+=2;
            } else{
                number+=2;
            }

        }
        return highestprime;
    }
}
