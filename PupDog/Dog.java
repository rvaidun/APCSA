package PupDog;

public class Dog {
    public void bark(){
        System.out.println("ruff");
    }
    public void barkII(){
        System.out.println("bark");
        bark();
    }
}
