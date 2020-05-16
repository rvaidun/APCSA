//Rahul Vaidun
//Period 3
package APStatFrau;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        int total = 0;
        int lowest = 0;
        int highest = 0;
        System.out.println("How many numbers would you like to enter");
        int amount = pen.nextInt();
        for (int x = 0; x < amount; x++){
            System.out.println("Enter a number");
            int it = pen.nextInt();
            total+=it;
            if (it < lowest){
                lowest = it;
            } if (it > highest){
                highest = it;
            }

        }
        System.out.println("Average is " + total/amount);
        System.out.println("Highest is " + highest);
        System.out.println("Lowest is " + lowest);

    }
}
