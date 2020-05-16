import java.util.*;
public class binarytime {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s1 = input.nextLine();
        String s2 = input.nextLine();
        String s3 = input.nextLine();
        String s4 = input.nextLine();
        String f1 = s4.substring(0, 1) + s3.substring(0, 1);
        String f2 = s4.substring(1, 2) + s3.substring(1, 2) + s2.substring(1, 2) + s1.substring(1, 2);
        String f3 = s4.substring(2 , 3) + s3.substring(2, 3) + s2.substring(2, 3);
        String f4 = s4.substring(3, 4) + s3.substring(3, 4) + s2.substring(3, 4) + s1.substring(3, 4);
        String f5 = s4.substring(4, 5) + s3.substring(4, 5) + s2.substring(4, 5);
        String f6 = s4.substring(5, 6) + s3.substring(5, 6) + s2.substring(5, 6) + s1.substring(5, 6);
        System.out.print(binaryClock(f1, 0) + " " + binaryClock(f2, 0) + ":" + binaryClock(f3, 0) + " " + binaryClock(f4, 0) + ":" + binaryClock(f5, 0) + " " + binaryClock(f6, 0));
        input.close();
    }


    public static int binaryClock(String first, int second) {
        if (first.length() == 0)
            return 0;
        else if (first.charAt(0) == '*')
            return (int) Math.pow(2, second) + binaryClock(first.substring(1, first.length()), second + 1);
        else
            return binaryClock(first.substring(1, first.length()), second + 1);
    }
}

