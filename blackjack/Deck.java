package blackjack;

import java.util.ArrayList;
import java.util.Random;

public class Deck {
    private ArrayList<Card> deck;
    private int index = 0;
    public void printDeck() {
        for(int i = 0; i < deck.size(); i++) {
            System.out.println(deck.get(i));
        }
    }
    public void shuffle() {
        Random rand = new Random();
        for(int i = 0; i < deck.size(); i++){
            int r1 = rand.nextInt(deck.size());
            int r2 = rand.nextInt(deck.size());
//            System.out.println(randomPosition);
            Card temp = deck.get(r1);
            deck.set(r1,deck.get(r2));
            deck.set(r2,temp);

        }
        index = 0;
    }
    public Deck() {
        deck = new ArrayList<Card>();
        for (int x = 0; x < 13; x++) {
            for(int y = 0; y < 4; y++) {
                Card c = new Card(y,x);
                deck.add(c);
            }
        }

    }
    public Card drawCard()
    {
        return deck.get(index++);
    }


    public static void main(String[] args) {
        Deck d = new Deck();
        d.shuffle();

    }
}