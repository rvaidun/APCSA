public class Contestant {
    int contestantID;
    private int points = 0;

    public Contestant(int contestantID) {
        this.contestantID = contestantID;
    }
    public void updateResult(int r) {
        points +=r;
    }

    public int getPoints() {
        return points;
    }
}
