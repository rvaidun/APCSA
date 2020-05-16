import java.util.Scanner;
public class TumorDetection {
    public static void makeRow(int x[][], String str, int row) {
        for(int i = 0; i < str.length(); i++) {
            x[row][i] = 0;
           if (str.substring(i,i+1).equals("1")){
               x[row][i] = 1;
           }

        }
    }

    public static boolean compare(int row, int col, int scan[][], int tumor[][]) {
        for(int r = 0; r < tumor.length; r++) {
            for(int c = 0; c < tumor.length; c++) {
                if (scan[r+row][c+col] != tumor[r][c]) {
                    return false;
                }
            }
        }
        return true;
    }
    public static int[][] rotateTumor(int tumor[][]) {
        int newT[][] = new int[tumor.length][tumor.length];
        for(int r = 0; r < tumor.length; r++) {
            for (int c = 0; c < tumor.length; c++) {
                newT[r][c] = tumor[c][tumor.length-r-1];
            }
        }
        return newT;
    }
    public static void main(String[] args) {
        Scanner pen = new Scanner (System.in);
        System.out.println("Enter scan");
        String x = pen.nextLine();
        int scanSize = x.length();
        int scan[][] = new int[scanSize][scanSize];
        for(int r = 0; r < scanSize; r++ ) {
            makeRow(scan,x,r);
            x = pen.nextLine();
        }
        System.out.println("Enter tumor");
        x = pen.nextLine();
        int tumorSize = x.length();
        int tumor[][] = new int[tumorSize][tumorSize];
        for(int r = 0; r < tumorSize; r++ ) {
            makeRow(tumor,x,r);
            x = pen.nextLine();
        }
        boolean found = false;
        for(int rotation = 0; rotation <= 3; rotation++) {
            for(int r = 0; r <= scanSize-tumorSize; r++){
                for(int c = 0; c <= scanSize-tumorSize; c++) {
                    if(compare(r,c,scan,tumor)) {
                        System.out.println("Possible tumor at (" + r + ", " + c + ", " + rotation*90 + ")");
                        found = true;
                    }
                }
            }
            tumor = rotateTumor(tumor);
        }
        if (!found) {
            System.out.println("No tumors detected.");
        }
        pen.close();
    }
}