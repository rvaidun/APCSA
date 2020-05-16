package GiantShoeProgram;

public class sock {
    private boolean exist;
    private String color;

    public sock() {
        this.exist = false;
        this.color = "black";
    }
    public sock(boolean exist, String color) {
        this.exist = exist;
        this.color = color;
    }
    public void setSock(String color) {
        this.color = color;
        this.exist = true;
    }
    public void removesock(){
        this.color = "nonexisitant";
        this.exist = false;
    }

    public String getColor() {
        return color;
    }
}
