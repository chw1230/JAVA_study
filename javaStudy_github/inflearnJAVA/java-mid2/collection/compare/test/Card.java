package collection.compare.test;

public class Card implements Comparable<Card> {
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
        // 숫자를 먼저 비교하고 숫자가 같으면 마크를 비교!!!
        if (this.rank != anotherCard.getRank()) { // 숫자가 다른경우 -> 두 수를 비교
            return Integer.compare(this.rank, anotherCard.getRank()); // 오름 차순으로 정렬됨 -> 작은수가 앞으로
        } else {
            return this.suit.compareTo(anotherCard.suit); // 여기서 의문 나 compareTo를 만든적이 없는데 뭐지?
            // Enum은 Enum을 상속받고 있음 그래서 Enum.comparTo 가능!
            // 그리고 Enum에도 comparable 구현되어 있음 -> ordinal 순서로!
            // ordinal 순서는 뭐지 -> Enum 생성 했을 때의 순서!!!를 의미!!!
            // 이 순서로 비교하도록 구현되어 있음!!
        }
    }

    @Override
    public String toString() {
        return rank + "(" + suit.getIcon() + ")";
    }
}
