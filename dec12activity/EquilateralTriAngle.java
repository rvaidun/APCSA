package dec12activity;

public class EquilateralTriAngle extends Rectangle{
    public double area() {
        return super.area()/2;
    }
    public double perimeter() {
        double hyp =  Math.sqrt(Math.pow(width,2)*Math.pow(height,2));
        return hyp + width + height;

    }

    public EquilateralTriAngle() {

    }

    public EquilateralTriAngle(int height, int width) {
        super(height, width);
    }
}
