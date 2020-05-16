package Project;

import java.util.Scanner;

public class scrabble {
    public static int letterPoints(String letter){
        if(letter.equals("a") || letter.equals("e")){
            return 1;
        }
        else if(letter.equals("d") || letter.equals("r")){
            return 2;
        }
        else if(letter.equals("b") || letter.equals("m")){
            return 3;
        }
        else if(letter.equals("v") || letter.equals("y")){
            return 4;
        }
        else if(letter.equals("j") || letter.equals("x")){
            return 8;
        }
        else{
            return 0;
        }
    }
    public static int dtlPoints(int num){
        if(num % 3 == 0 && num % 2 != 0) {
            return 2;
        } else if (num % 5 == 0){
            return 3;
        } else {
            return 1;
        }
    }
    public static int dtwPoints(int num) {
        if (num % 7 == 0 && num % 3 != 0 && num % 5 != 0) {
            return 2;
        } else if (num % 8 == 0 && (num % 3 != 0 || num % 2 == 0) && num % 5 != 0) {
            return 3;
        }
        else{
            return 1;
        }
    }
    public static int score(String l1, String l2, String l3, String l4, int start){
        int sum = 0;
        sum +=letterPoints(l1)*dtlPoints(start);
        sum +=letterPoints(l2)*dtlPoints(start+1);
        sum +=letterPoints(l3)*dtlPoints(start+2);
        sum +=letterPoints(l4)*dtlPoints(start+3);
        sum *= dtwPoints(start)*dtwPoints(start+1)*dtwPoints(start+2)*dtwPoints(start+3);
        return sum;
    }
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Enter first Letter");
        String l1 = pen.nextLine();
        System.out.println("Enter second Letter");
        String l2 = pen.nextLine();
        System.out.println("Enter third Letter");
        String l3 = pen.nextLine();
        System.out.println("Enter fourth Letter");
        String l4 = pen.nextLine();
        while (true) {
            System.out.println("Enter starting point");
            int p1 = pen.nextInt();
            System.out.println(score(l1,l2,l3,l4,p1));

        }
    }
}
