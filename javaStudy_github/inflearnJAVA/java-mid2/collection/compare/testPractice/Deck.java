package collection.compare.testPractice;

import collection.compare.test.Card;
import collection.compare.test.Suit;

import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    ArrayList<Card> cards = new ArrayList<>();

    private void initCard(){
        for (int i = 1; i <= 13; i++) {
            for (Suit suit : Suit.values()) {
                cards.add(new Card(i, suit)); // ENUM에서 선언한 순서가 그대로 넘어옴!
            }
        }
    }

    public Deck(){
        initCard();
        shuffle();
    }

    private void shuffle(){
        Collections.shuffle(cards);
    }

    Card drawCard(){
        return cards.removeFirst(); // 첫 번째 꺼내기
    }

}
