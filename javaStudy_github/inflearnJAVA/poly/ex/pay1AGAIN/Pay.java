package poly.ex.pay1AGAIN;

public interface Pay {
    // 6 - 일단 생성했는데 뭘 해야하지? -> NaverPay,KakaoPay에 공통적으로 있는 것을 코드 넣으면 되겠구나!
    public boolean pay(int amount);
    // 7 - 그러면 각각의 클래스들에 이동해서 구현 처리하자!
}
