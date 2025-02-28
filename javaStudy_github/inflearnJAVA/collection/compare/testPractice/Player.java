package collection.compare.testPractice;

import collection.compare.test.Card;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private String name;
    private List<Card> hand;

    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<collection.compare.test.Card>();
    }

    public void addCard(collection.compare.test.Card card) {
        hand.add(card);
    }

    public void drawCard(Deck deck) {
        hand.add(deck.drawCard());
    }

    public int rankSum(){
        int value = 0;
        for (collection.compare.test.Card card : hand) {
            value += card.getRank();
        }
        return value;
    }

    public void showHand(){
        hand.sort(null);
        System.out.println(name + "의 카드" + hand + ",합계: " + rankSum());
    }

    public String getName() {
        return name;
    }
}
