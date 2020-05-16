//Rahul Vaidun
//Period 3

import java.util.Scanner;

public class divisionWithoutDoubles {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = pen.nextInt();
        pen.nextLine();
        System.out.println("Enter another number");
        int y = pen.nextInt();
        pen.nextLine();
//        for (int z = 0; z <(x/y) + 10; z++){
//            System.out.println(x % y);
        int z = x/y;
        System.out.print(z +".");
        for(int w = 0; w < 10; w++){
            int m = x % y;
            int r = m * 10;
            System.out.print(r/y);
            x = r;
        }
        pen.close();
    }
}
