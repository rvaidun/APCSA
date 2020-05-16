package blackjack;

public class Card {
    int suit;
    int value;
    private static String[] number = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    private static String[] suits = {"c","d","h","s"};
    public int getNum() {
        return value;
    }

    public void setNum(int num) {
        this.value = num;
    }

    public Card(int suit, int value) {
        this.value = value;
        this.suit = suit;

    }
    public String toString() {
        return number[value]+""+suits[suit];
    }
    public int getValue() {
        if (value >= 10){
            return 10;
        }
        return value+1;
    }
    public void setValue(int set) {
        value = set;
    }

}