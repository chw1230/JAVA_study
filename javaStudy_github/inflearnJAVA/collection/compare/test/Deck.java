package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.List;

public class Deck {

    private List<Card> cards = new ArrayList<>();

    public Deck(){
        initCard();
        Shuffle();
    }

    private void initCard() {
        for (int i = 1; i <= 13; i++) {
            for (Suit value : Suit.values()) {
                cards.add(new Card(i, value));
            }
        }
    }

    private void Shuffle() {
        Collections.shuffle(cards);
    }

    public Card drawCard() {
        return cards.removeFirst(); // 첫 번쨰 꺼내기
    }



}
