package FootWear;

public class FootWear {
    int size;
    String color;

    public FootWear(int size, String color) {
        this.size = size;
        this.color = color;
    }
    //Dummy Function to be overridden by subclass
    public boolean match(String fw, int size, String color, String type, String material, String freshOrStinky){
        return true;
    }

}
