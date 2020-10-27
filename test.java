
public class test {
    public static void main(String[] args) {
        int moss = 1;
        int ssom = 33;
        char inspiration = 'e';

        System.out.println('i' + whoWins(moss, inspiration) + moss + 'a');
        System.out.println(fasterThanLight((int) inspiration, (char) ssom));
    }
    public static String whoWins(int moss, char inspiration) {
        String winner = "";
        for (int i = 0; i < 5; i++) {
            winner = 'a' + "moss";
            return winner;
        }
        return "no one...";
    }
    public static String fasterThanLight(int inspiration, char moss) {
        String liveIn = "Darkness" + moss;
        for (int j = moss / 11; j >= -1; j--) {
            liveIn += (char) (inspiration - j);
        }
        return liveIn;
    }
}
