//Rahul Vaidun
//Period 3
package Project;

public class NBAPlayer {
    int pointsPerGame;
    int assistsPerGame;
    int reboundsPerGame;
    int gamesPlayed;

    public NBAPlayer(int pointsPerGame, int assistsPerGame, int reboundsPerGame, int gamesPlayed) {
        this.pointsPerGame = pointsPerGame;
        this.assistsPerGame = assistsPerGame;
        this.reboundsPerGame = reboundsPerGame;
        this.gamesPlayed = gamesPlayed;
    }
    public NBAPlayer() {
        this.pointsPerGame = 0;
        this.assistsPerGame = 0;
        this.reboundsPerGame = 0;
        this.gamesPlayed = 0;
    }



    public void setGamesPlayed(int gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public int getGamesPlayed() {
        return gamesPlayed;
    }

    public void setPointsPerGame(int pointsPerGame) {
        this.pointsPerGame = pointsPerGame;
    }

    public void setAssistsPerGame(int assistsPerGame) {
        this.assistsPerGame = assistsPerGame;
    }

    public void setReboundsPerGame(int reboundsPerGame) {
        this.reboundsPerGame = reboundsPerGame;
    }

    public int getPointsPerGame() {
        return pointsPerGame;
    }

    public int getAssistsPerGame() {
        return assistsPerGame;
    }

    public int getReboundsPerGame() {
        return reboundsPerGame;
    }
    public void addStats(int points, int assists, int rebounds){
        setGamesPlayed(gamesPlayed+1);
        setPointsPerGame((points+getPointsPerGame())/getGamesPlayed());
        setAssistsPerGame((assists+getAssistsPerGame())/getGamesPlayed());
        setReboundsPerGame((rebounds+getReboundsPerGame())/getGamesPlayed());
    }
}
