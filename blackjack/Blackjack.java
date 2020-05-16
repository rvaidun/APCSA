package blackjack;

import java.util.Scanner;

public class Blackjack {
    Player pl[] = new Player[3];
    Deck d = new Deck();
    public Blackjack(){
        pl[0] = new Player("Player",21);
        pl[1] = new Player("CPU Player",16);
        pl[2] = new Player("Dealer", 17);
        d.shuffle();
    }
    public void payout() {
        int d = pl[2].getHandValue();
        for(int i = 0; i < 2; i++ ) {
            Player p = pl[i];
            int hv = p.getHandValue();
            if (hv == 21 && p.hand.size() == 2) {
                p.updateBalance(p.getBet() * 1.5);
                System.out.println(p.getName() + " got blackjack " + p.getBet() );
            } else if (hv > 21 || (hv < d && d <= 21)) {
                p.updateBalance(-p.getBet());
                System.out.println(p.getName() + " lost " + p.getBet() );
            } else if (hv > d || d > 21) {
                p.updateBalance(p.getBet());
                System.out.println(p.getName() + " won " + p.getBet());
            } else {
                System.out.println(p.getName() + " push " + p.getBet());
            }

        }
    }
    public void showTable(boolean showDealer) {
        System.out.printf("%-20s%-20s%-20s\n",pl[0].getName() + "(" + pl[0].getMoney() + ")",
                pl[1].getName() + "(" + pl[1].getMoney() + ")",
                pl[2].getName() + "(" + pl[2].getMoney() + ")");
        for(int i = 0; i < pl.length; i++) {
            System.out.printf("%-20s",pl[i].displayHand(showDealer));
        }
        System.out.println("\n");
    }

    public void deal(Scanner pen) {
        for(int i = 0; i < 3; i++) {
            pl[i].hand.clear();
        }
        for(int i = 0; i < 6; i++) {
            pl[i % 3].addCard(d.drawCard());
        }
        System.out.println();
        if (pl[2].getHandValue() == 21){
            showTable(true);
            payout();
            return;
        }
        int i = 0;
        while (i < 3) {
            Player p = pl[i];
            showTable(i == 2);
            if (p.getHandValue() == 21) {
                System.out.println("blackjack");
                i++;
            }
            if (p.getHandValue() > 21) {
                System.out.println("bust");
                i++;
            } else if (p.getHandValue() < p.getMaxValue()) {
                if (i == 0) { // 0 is non-cpu player
                    System.out.println("hit or stand?(h or s)");
                    String choice = pen.nextLine();
                    if (choice.equals("s")) {
                        i++;
                        continue;
                    }
                }
                p.addCard(d.drawCard());
            }else{
                i++;
            }
        }
        payout();
    }


    public static void main(String[] args) {
        Blackjack blackjack = new Blackjack();
        Scanner pen = new Scanner(System.in);
        while(blackjack.pl[0].getMoney() > 5) {
            blackjack.pl[0].getBetAmount(pen);
            blackjack.deal(pen);

            blackjack.d.shuffle();
        }
    }
}
