package PupDog;

public class puppy extends Dog {
    public void bark () {
        System.out.println("meow");
    }
    public void barkII() {
        super.bark();
        super.barkII();
    }

    public static void main(String[] args) {
        Dog x = new puppy();
        x.barkII();


    }
}
