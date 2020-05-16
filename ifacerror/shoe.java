package ifacerror;

public abstract class shoe implements shooe{
    String color;

    public shoe(String color) {
        this.color = color;
    }
    public void printhi() {
        System.out.println("hi");
    }

}
