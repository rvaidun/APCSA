package Project;

public class parallelogram extends Shapes {
    public parallelogram(int height, int top, int bottom, int left, int right) {
        super(height, top, bottom, left, right);
    }
    public Double area(){
        return this.sides[1]*this.sides[0] + 0.0;
    }
}
