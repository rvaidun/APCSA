package inClass;

public class  shirt {
    String size;
    String color;

    //constructor
    public shirt (String a, String b){
        size = a;
        color = b;

    }

    public String getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public void setSize(String a) {
        size = a;
    }

    public void setColor(String b) {
        color = b;
    }
    public void display() {
        System.out.println("The size is " + size);
        System.out.println("The color is " + color);
    }

}
