//package Shoe;
//
//import java.util.Scanner;
//
//public class Sauce {
//    public static void main(String[] args) {
//        Scanner pen = new Scanner(System.in);
//        System.out.println(" How many shoes would you like in the shelf");
//        int total = pen.nextInt();
//        Shoe [] arrayshelf = new Shoe[total];
//        for(int x = 0; x < total; x++){
//            System.out.println("Shoe #" + x);
//            System.out.println("What color is the shoe");
//            String color = pen.next();
//            pen.nextLine();
//            System.out.println("What size is the shoe");
//            int size = pen.nextInt();
//            pen.nextLine();
//            Shoe shoe = new Shoe(size,color);
//            System.out.println("Shoe Created");
//            arrayshelf[x] = shoe;
//        }
//        for (int i = 0; i < arrayshelf.length; i++){
//            System.out.println(arrayshelf[i]);
//        }
//    }
//}
