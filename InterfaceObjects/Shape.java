package InterfaceObjects;

public abstract class Shape {
    int height;
    int width;
    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }
    public Shape() {
        this.height=1;
        this.width=0;

    }

    public int getWidth() {
        return width;
    }
}
