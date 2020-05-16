public class Heat {
    String name;
    Contestant contestant [] = new Contestant[5];

    public Heat(String s) {
        this.name = s;
    }

    public void addContestant(Contestant c, int i) {
        this.contestant[i] = c;
    }
    public void updateResult(int c, int r) {
        contestant[c].updateResult(r);
    }
}
