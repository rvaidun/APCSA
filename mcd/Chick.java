package mcd;
import java.util.Random;

public class Chick implements Animal {
    private String myType;
    private String mySound1;
    private String mySound2;
    public Chick (String type, String sound1) {
        myType = type;
        mySound1 = sound1;
    }
    public Chick(String type, String sound1, String sound2) {
        myType = type;
        mySound1=sound1;
        mySound2 = sound2;
        System.out.println();
    }
    public String getSound() {
        if (mySound2 != null) {
            String [] arr = {mySound1,mySound2};

            Random random = new Random();
            int select = random.nextInt(arr.length);
            return arr[select];
        }
        return mySound1;
    }
    public String getType() {
        return myType;
    }

    public static void main(String[] args) {
        Chick c = new Chick("chick", "cheep","cluck");
        System.out.println(c.getSound());
        System.out.println("MONOPOLY HAHA LIKE ILL CODE IT ");
    }
}