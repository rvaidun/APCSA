package mcd;

public class NamedCow extends Cow{
    String myName;
    public NamedCow(String type, String name, String sound) {
        super(type,sound);
        myName = name;
    }
    public String getName() {
        return myName;
    }
}
