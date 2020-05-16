package Project;

public class NestedMultLoop {
    public static void main(String[] args) {
        int [][] x = new int [10][10];
        for(int y = 1; y <=10; y++) {
            for(int w = 1; w <=10; w++) {
                x[y-1][w-1] = y*w;
            }
        }
        for(int [] w : x) {
            for(int z : w){
                System.out.print(z + " ");
            }
            System.out.println();

        }
    }
}
