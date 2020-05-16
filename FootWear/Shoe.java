package FootWear;

import java.util.Objects;

public class Shoe extends FootWear{
    String type;

    public Shoe(int size, String color, String type) {
        super(size, color);
        this.type = type;
    }

    @Override
    public String toString() {
        return "Shoe{" +
                "type='" + type + '\'' +
                ", size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
    public boolean match(String fw, int size, String color, String type, String material, String freshOrStinky) {
        if (fw == null || fw.equals("shoe")) {
            return ((size == -1 || size == this.size) &&
                    (color == null || color.equals(this.color)) &&
                    (type == null || type.equals(this.type)) &&
                    (material == null && freshOrStinky == null));
        }
        return false;
    }
}
