package Project;

public class trapezoid extends Shapes {
    public trapezoid(int height, int top, int bottom, int left, int right) {
        super(height, top, bottom, left, right);
    }
    public Double area(){
        double average = (this.sides[1] + this.sides[2])/2;
        return average*this.sides[0];
    }
}
