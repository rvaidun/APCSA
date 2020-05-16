import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Hanjie {
    Scanner input;
    public static ArrayList<Integer> consec(boolean arr[]) {
        ArrayList<Integer> ret = new ArrayList<Integer>();
        int c = 0;
        for(int i = 0; i < arr.length; i++) {
            if (arr[i]){
                c++;
            } else{
                if (c > 0)
                    ret.add(c);
                c = 0;
            }

        }
        if (c > 0){
            ret.add(c);
        }
        return ret;
    }
    public static boolean consecutive(int start, int end, boolean[] arr2d) {
        for(; start < end; start++) {
            if (!arr2d[start])
                return false;
        }
        return true;
    }

    public static boolean[] getColumn(boolean[][] matrix, int column) {
        boolean ret[] = new boolean[10];
        for (int row = 0; row < ret.length; row++) {
            ret[row] = matrix[row][column];
        }
        return ret;
    }

    public static boolean validator(int[] xvals, int[] yvals, boolean[][] arr2d) {
        for (int i = 0; i < xvals.length; i += 3) {
            int col = i / 3;
            ArrayList<Integer> conN = new ArrayList<Integer>();
            for (int j = i; j < i + 3; j++) {
                if (xvals[j] != 0)
                    conN.add(xvals[j]);
            }

            if(conN.size() == 0)
                continue;
            ArrayList<Integer> getconsec = consec(getColumn(arr2d, col));
            if (getconsec.size() != conN.size())
                return false;
            for (int x = 0; x < conN.size(); x++) {
                if (!getconsec.get(x).equals(conN.get(x)))
                    return false;
            }
        }


        for (int i = 0; i < yvals.length; i += 3) {
            int row = i / 3;
            ArrayList<Integer> conN = new ArrayList<Integer>();
            for (int j = i; j < i + 3; j++) {
                if (yvals[j] != 0)
                    conN.add(yvals[j]);
            }
            if (conN.size() == 0)
                continue;
            ArrayList<Integer> getconsec = consec(arr2d[row]);
            if (getconsec.size() != conN.size())
                return false;

            for (int x = 0; x < conN.size(); x++) {
                if (!getconsec.get(x).equals(conN.get(x)))
                    return false;
            }
        }
        return true;
    }


    public static boolean[][] randomBoolean() {
        Random random = new Random();
        boolean [][] arr = new boolean[10][10];
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < arr[r].length; c++) {
                arr[r][c] = random.nextBoolean();
            }
        }
        return arr;
    }
    public static boolean[][] actual() {
        boolean[][] ret = new boolean[10][10];
        for (int r = 0; r < 10; r++) {
            for (int c = 0; c < ret[r].length; c++) {
                ret[r][c] = false;
            }
        }
        ret[0][0] = true;
        ret[1][0] = true;
        ret[2][0] = true;
        ret[9][0] = true;
        ret[9][8] = true;
        ret[9][9] = true;
        ret[9][7] = true;
        ret[9][6] = true;
        ret[9][5] = true;
        ret[9][4] = true;
        ret[9][3] = true;
        ret[9][2] = true;
        ret[9][1] = true;
        ret[8][1] = true;
        ret[8][2] = true;
        ret[8][3] = true;
        ret[8][4] = true;
        ret[8][5] = true;
        ret[8][6] = true;
        ret[8][7] = true;
        ret[8][8] = true;
        ret[7][2] = true;
        ret[7][3] = true;
        ret[7][4] = true;
        ret[7][5] = true;
        ret[7][6] = true;
        ret[7][7] = true;
        ret[7][9] = true;
        ret[6][3] = true;
        ret[6][4] = true;
        ret[6][5] = true;
        ret[6][6] = true;
        ret[4][4] = true;
        ret[4][5] = true;
        ret[3][4] = true;
        ret[3][5] = true;
        ret[2][4] = true;
        ret[2][5] = true;
        ret[2][9] = true;
        ret[1][3] = true;
        ret[1][4] = true;
        ret[1][5] = true;
        ret[1][6] = true;
        ret[1][9] = true;
        ret[0][3] = true;
        ret[0][4] = true;
        ret[0][5] = true;
        ret[0][6] = true;
        ret[0][9] = true;

        return ret;
    }

    public static void main(String[] args) {
        System.out.println("Came here");
        try {
            File file = new File("/Users/rahul/JavaPrograms/APCS/src/inputTest");
            Scanner input = new Scanner(file);
            Scanner pen = new Scanner(System.in);
            int xvals[] = new int[30];
            for (int x = 0; x < xvals.length; x++) {
                xvals[x] = input.nextInt();
            }
            int yvals[] = new int [30];
            for(int y = 0; y < yvals.length; y++) {
                yvals[y] = input.nextInt();
            }
            boolean match = false;
            boolean [][]randombool = randomBoolean();
            while (!match) {
                if (validator(xvals,yvals,randombool)) {
                    match = true;
                    for (int r = 0; r < 10; r++) {
                        for (int c = 0; c < randombool[r].length; c++) {
                            if (randombool[r][c]) {
                                System.out.print("X");
                            } else{
                                System.out.print(".");
                            }

                        }
                        System.out.println();
                    }
                }

                else{
                    System.out.println("no match");
                    randombool = randomBoolean();
                }

            }
            pen.close();
            input.close();
        } catch(IOException e) {
            // do something
            e.printStackTrace();
        }
    }
}
