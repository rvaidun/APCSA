package Project;

import java.util.Scanner;

public class FractionCalculator {
    public static int greatestCommonMultiple(int num1, int num2){
        if (num2 == 0){
            return num1;
        } else{
            return greatestCommonMultiple(num2, num1 % num2);

        }
    }
    public static void addition(int n1, int d1, int n2, int d2){
        int comd = d2 * d1;
        int newn = n1*d2 + n2*d1;
        int gcm;
        if (comd < 0 ^ newn < 0) {
            gcm = -greatestCommonMultiple(newn, comd);
        } else {
            gcm = greatestCommonMultiple(newn, comd);
        }

        if (comd/gcm == 1){
            System.out.println(newn/gcm);
        } else if (comd == 0) {
            System.out.println("No ");
        }
        else{
            System.out.println((newn / gcm) + "/" + (comd/gcm));
        }

    }
    public static void subtraction(int n1, int d1, int n2, int d2){
        int comd = d2 * d1;
        int newn = n1*d2 - n2*d1;
        int gcm = greatestCommonMultiple(newn, comd);
        if (comd/gcm == 1){
            System.out.println(newn/gcm);
        } else{
            System.out.println((newn / gcm) + "/" + (comd/gcm));
        }
    }
    public static void multiplication(int n1, int d1, int n2, int d2){
        int newn = n1 * n2;
        int newd = d1 * d2;
        int gcm = greatestCommonMultiple(newn, newd);
        if (newd/gcm == 1){
            System.out.println(newn/gcm);
        } else{
            System.out.println((newn / gcm) + "/" + (newd/gcm));
        }
    }
    public static void division(int n1, int d1, int n2, int d2){
        int newn = n1 * d2;
        int newd = d1 * n2;
        int gcm = greatestCommonMultiple(newn, newd);
        if (newd/gcm == 1){
            System.out.println(newn/gcm);
        } else{
            System.out.println((newn / gcm) + "/" + (newd/gcm));
        }
    }
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("Enter numerator of first fraction");
        int n1= pen.nextInt();
        System.out.println("Enter denominator of first fraction");
        int d1 = pen.nextInt();
        System.out.println("Enter numerator of second fraction");
        int n2= pen.nextInt();
        System.out.println("Enter denominator of second fraction");
        int d2 = pen.nextInt();
        System.out.println("Press 1 for addition 2 for subtraction 3 for multiplication and 4 for division");
        int operator = pen.nextInt();
        if (operator == 1 ){
            addition(n1,d1,n2,d2);
        } else if (operator == 2 ){
            subtraction(n1,d1,n2,d2);
        } else if (operator == 3){
            multiplication(n1,d2,n2,d2);
        } else if (operator == 4 ){
            division(n1,d1,n2,d2);
        }
        pen.close();
    }
}
