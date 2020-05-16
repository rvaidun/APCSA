package GiantShoeProgram;

public class human {
    private String name;
    private Shoeshelf x;

    public human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shoeshelf getX() {
        return x;
    }

    public void setX(Shoeshelf x) {
        this.x = x;
    }
    public String toString() {
        String ll = (" My name is " + name);
        String ll1 = (" My shoe is called " + x.getshoe(0).getName() );
        String ll2 = (" My left sock is " + x.getshoe(0).getLeftSock().getColor());
        String ll3 = (" My right sock is " + x.getshoe(0).getRightSock().getColor());
        return ll +"\n" + ll1 +"\n" +ll2 +"\n"+ ll3;
    }
}
