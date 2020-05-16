package blackjack;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    public ArrayList<Card> hand;
    private String name;
    private int handValue = 0;
    private double money;
    private int bet;
    private int maxValue;


    public Player( String name, int m) {
        hand = new ArrayList<>();
        this.money = 1000;
        this.bet=5;
        this.maxValue = m;
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void updateBalance(double money) {
        this.money += money;
    }
    public void addCard(Card c) {
        int aceCount=0;
        hand.add(c);

        handValue = 0;
        for(int i = 0; i < hand.size(); i++) {
            int n = hand.get(i).getValue();
            if (n == 1) {
                aceCount++;
            } else {
                handValue += hand.get(i).getValue();
            }
        }
        if (aceCount > 0 ) {
            handValue += aceCount + 10;
            if (handValue > 21) {
                handValue -= 10;
            }
        }
    }
    public int getHandValue() {
        return handValue;
    }
    public void setBet(int bet) {
        this.bet = bet;
    }
    public int getMaxValue() {
        return maxValue;
    }
    public int getBet() {
        return bet;
    }
    public void getBetAmount(Scanner pen) {
        while (true) {
            System.out.println("You have " + money + ". How much money would you like to bet?");
            int bet = pen.nextInt();
            pen.nextLine();
            if (bet < 5)
                continue;
            if (this.getMoney() < bet )
                continue;
            this.bet = bet;
            return;
        }
    }
    public String displayHand(boolean showDealer) {
        int i = 0;
        String str = "";
        if (!showDealer && name.equals("Dealer")) {
            i=1;
        }
        while(i < hand.size()) {
            str += hand.get(i) + " ";
            i++;
        }
        if (!name.equals("Dealer") || showDealer) {
            str +="(" + handValue + ")";
        }
        return str;
    }

    public String getName() {
        return name;
    }
}