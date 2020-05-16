package dec12activity;

public class Rectangle extends Shape{
    public Rectangle() {
    }

    public Rectangle(int height, int width) {
        super(height, width);
    }
    public double area() {
        return height*width;
    }
    public double perimeter() {
        return height*2 +  width*2;

    }
}
