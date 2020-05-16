import java.util.Scanner;

public class TowerofBabel {
    public static void babel(int n, String start, String mid, String end) {
        if (n == 1){
            System.out.println(start + " to " + end);
        } else {
            babel(n -1, start, end, mid);
            System.out.println(start + " to " + end);
            babel(n -1, mid, start , end);
        }
    }
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        System.out.println("How many disks");
        int discs = pen.nextInt();
        babel(discs,"A","B","C");
        pen.close();
       }
}
