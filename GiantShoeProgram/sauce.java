package GiantShoeProgram;

public class sauce {
    public static void main(String[] args) {
        human self = new human("Rahul");
        Shoeshelf shoeshelf = new Shoeshelf();
        sock ls = new sock();
        sock rs = new sock();
        sock[] x = new sock[2];
        x[0] = rs;
        x[1] = ls;
        shoe shoe = new shoe("cool", 10, "black", x);
        shoeshelf.addshoe(shoe);
        self.setX(shoeshelf);
        System.out.println(self);

    }
}
