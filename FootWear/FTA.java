package FootWear;

import javax.print.attribute.standard.SheetCollate;
import java.util.ArrayList;

public class FTA {
    ArrayList<FootWear> FootwearArray = new ArrayList<FootWear>();
    public FTA() {

    }
    public void remove(int pos) {
        FootwearArray.remove(pos-1);
    }
    public void add(FootWear x) {
        FootwearArray.add(x);
    }
    public void insert(int pos, FootWear x) {
        FootwearArray.add(pos-1, x);

    }

    public void search(String fw, int size, String color, String type, String material, String freshOrStinky) {
        for(int x = 0; x < FootwearArray.size(); x++) {
            FootWear f = FootwearArray.get(x);
            if (f.match(fw,size,color,type,material,freshOrStinky)) {
                System.out.print(f);
                System.out.println(" found at position " + (x + 1));
            }
        }

    }
    public static void main(String[] args) {
        Shoe s = new Shoe(4, "Blue", "Sneakers");
        Shoe w = new Shoe(2, "Blue", "Sneakers");
        //Sock a = new Sock(3,"Blue","Cotton",true);
        Shoe b = new Shoe(3, "Blue", "Sneakers");
        FTA fta = new FTA();
        fta.add(s);
        fta.add(w);
        //fta.add(a);
        fta.add(b);
        fta.search("shoe",-1,"Blue",null,null,null);

    }
}
