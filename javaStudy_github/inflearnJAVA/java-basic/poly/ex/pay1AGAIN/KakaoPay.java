package poly.ex.pay1AGAIN;
// 9 - 구현 처리 완료
// 10 - PerService로 이동
public class KakaoPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("카카오페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
