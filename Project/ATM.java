//Rahul Vaidun
//Period 3
package Project;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        int balance = 10000;
        boolean bool = true;
        while (bool) {
            System.out.println("Enter password.");
            System.out.println("Enter nothing to exit.");
            String password = pen.nextLine();
            if (password.equals("2018")){
                while (true){
                    System.out.println("What would you like to do. Press the number");
                    System.out.println("1. Deposit");
                    System.out.println("2. Withdrawl");
                    System.out.println("3. Quick Cash");
                    System.out.println("4. Check balance");
                    System.out.println("5. End");
                    int what = pen.nextInt();
                    pen.nextLine();
                    if (what == 1){
                        balance = deposit(balance,pen);
                        System.out.println("Your new balance is " + balance);

                    } else if (what == 2){
                        balance = withdraw(balance, pen);
                        System.out.println("Your new balance is " + balance);

                    } else if (what == 3){
                        balance = quickcash(balance, pen);
                        System.out.println("Your new balance is " + balance);

                    } else if (what == 4){
                        checkBalence(balance);
                    } else if (what == 5){
                        System.out.println("Have a good day");
                        bool = false;
                        break;
                    } else{
                        System.out.println("Please enter a valid character");
                    }
                }

            } else if (password.equals("")){
                bool = false;
                System.out.println("Have a good day");
            } else{
                System.out.println("Password is incorrect");
            }
        }
    }
    public static int deposit(int start, Scanner pen){
        System.out.println("How much money would you like to deposit");
        int dep = pen.nextInt();
        pen.nextLine();
        return start+=dep;
    }
    public static int withdraw(int start, Scanner pen){
        System.out.println("How much money would you like to withdraw");
        int wit = pen.nextInt();
        pen.nextLine();
        return start-=wit;
    }
    public static int quickcash(int start, Scanner pen2){
        System.out.println("How much money would you like to withdraw?");
        System.out.println("1. $5");
        System.out.println("2. $10");
        System.out.println("3. $20");
        System.out.println("4. $50");
        System.out.println("5. $100");
        System.out.println("6. $200");
        boolean bool = true;
        while (bool){
            int z = pen2.nextInt();
            pen2.nextLine();
            if (z == 1){
                return start-=5;
            } else if (z == 2){
                return start-=10;
            }else if (z == 3){
                return start-=20;
            }else if (z == 4){
                return start-=50;
            }else if (z == 5){
                return start-=100;
            }else if (z == 6){
                return start-=200;
            } else{
                System.out.println("Please enter a valid character");
            }
        }
        return 0;
    }
    public static void checkBalence(int start){
        System.out.println("Your balence is " + start);
    }
}