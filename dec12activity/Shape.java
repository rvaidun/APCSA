package dec12activity;

public class Shape {
    double height;
    double width;

    public Shape() {
        this.height = 1;
        this.width = 1;
    }

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
