import java.util.Scanner;

public class Lawn {
    private int width;
    private int length;
    private String cell[][];
    private int freeNeighbors[][];
    private boolean visited[][];
    private String out[][];
    private int finalFreeNeighbors[][];
    private int arrx[];
    private int arry[];
    private int elements = 1;

    private Lawn(Scanner pen) {
        this.length = pen.nextInt();
        this.width = pen.nextInt();
        this.arrx = new int[(length*width)*2];
        this.arry = new int[(length*width)*2];
        this.arrx[0] = pen.nextInt();
        this.arry[0]  = pen.nextInt();
        this.cell= new String[width][length];
        this.out= new String[width][length];
        this.freeNeighbors = new int[width+2][length+2];
        this.finalFreeNeighbors=new int[width+2][length+2];
        this.visited = new boolean[width][length];
        for(int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                cell[x][y] = out[x][y] = pen.next();
                if (cell[x][y].equals(".")) {
                    freeNeighbors[x+1][y+1] = 1;
                }
                visited[x][y] = false;
            }
            pen.nextLine();
        }
        for(int y = 0; y <length; y++){
            for(int x = 0; x < width; x++) {
                if (freeNeighbors[x+1][y+1] == 1) {
                    finalFreeNeighbors[x+1][y+1] = freeNeighbors[x+1][y]+freeNeighbors[x+1][y+2]+
                            freeNeighbors[x+2][y]+freeNeighbors[x+2][y+2]+freeNeighbors[x+2][y+1]+
                            freeNeighbors[x][y]+freeNeighbors[x][y+1]+freeNeighbors[x][y+2];
                }
            }
        }

    }
    private void printBoard() {
        for(int y = 0; y < length; y++) {
            for (int x = 0; x < width; x++) {
                System.out.print(out[x][y]+ " ");
            }
            System.out.println();
        }
    }
    private void cutAndRemove() {
        elements--;
        int x = arrx[elements];
        int y = arry[elements];
        for(int i = -1; i <= 1; i++) {
            for(int j = -1; j <=1; j++) {
                if(finalFreeNeighbors[x+i+1][y+j+1] != 0 ) {
                    out[x+i][y+j] = "C";
                }
            }

        }
    }
    private void addElement(int x, int y) {
        arrx[elements] = x;
        arry[elements] = y;
        elements++;
        visited[x][y] = true;
    }
    private void mow() {
        while (elements > 0) {
            cutAndRemove();
            int x = arrx[elements];
            int y = arry[elements];
            //System.out.println(x);
            if (!visited[x-1][y]&&finalFreeNeighbors[x][y+1] == 8) {
                addElement(x-1,y);
            }
            if (!visited[x+1][y]&&finalFreeNeighbors[x+2][y+1] == 8) {
                addElement(x+1,y);
            }
            if (!visited[x][y+1]&&finalFreeNeighbors[x+1][y+2] == 8) {
                addElement(x,y+1);
            }
            if (!visited[x][y-1]&&finalFreeNeighbors[x+1][y] == 8) {
                addElement(x,y-1);
            }
        }
        }
    public static void main(String[] args) {
        Scanner pen = new Scanner (System.in);
        int numLawns = pen.nextInt();
        pen.nextLine();
        while (numLawns-- > 0) {
            Lawn lawn = new Lawn(pen);
            lawn.mow();
            lawn.printBoard();
            System.out.println();
        }
    }
}