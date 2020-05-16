package Project;

public abstract class Shapes {
    int [] sides = new int[5];
    public Shapes (int height, int top, int bottom, int left, int right) {
        sides[0] = height; sides[1] = top; sides[2] = bottom; sides[3] = left; sides[4] = right;
    }
    public Double area() {
        return 1+2+3+4+5 + 0.0;
    }
    public int perimeter(){
        return sides[1] + sides[2] + sides[3] + sides[4];
    }
}

