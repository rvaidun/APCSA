package Project;

public class tenxten {
    public static void main(String[] args) {
        int [][] x = new int[10][10];
        for(int z = 0; z < 10; z++) {
            for(int y = 0; y < 10; y++) {
                x[z][y] = (z+1)*(y+1);
            }
        }
    }
}
