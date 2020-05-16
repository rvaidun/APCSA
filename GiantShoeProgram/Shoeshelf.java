package GiantShoeProgram;

import java.util.ArrayList;

public class Shoeshelf {
    private ArrayList<shoe> shoelist = new ArrayList<shoe>();

    public Shoeshelf() {
    }
    public shoe getshoe(int num) {
        return shoelist.get(num);
    }
    public void addshoe(shoe num) {
        this.shoelist.add(num);
    }
    public void removeshoe(int num) {
        this.shoelist.remove(num);
    }
    public void displayallshoes(){
        for (shoe x: shoelist) {
            System.out.println(x.getName());

        }
    }
}
