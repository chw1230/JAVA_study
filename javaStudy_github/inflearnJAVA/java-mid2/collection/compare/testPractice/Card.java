package collection.compare.testPractice;

import collection.compare.test.Suit;

public class Card implements Comparable<Card>{
    private final int rank; // 카드의 숫자
    private final Suit suit; // 카드의 마크

    public Card(int rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getRank() {
        return rank;
    }

    public Suit getSuit() {
        return suit;
    }

    @Override
    public int compareTo(Card anotherCard) {
        // 숫자 우선 비교
        if (this.rank != anotherCard.rank) {
            return Integer.compare(this.rank, anotherCard.getRank()); // 오름차순 정렬
        } else {
            // 숫자 같으면 모양 비교
            return this.suit.compareTo(anotherCard.suit); // ENUM에서 정의한 순서를 통해서 비교!!
        }
    }

    @Override
    public String toString() {

    }
}
