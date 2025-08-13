package poly.ex.pay1AGAIN;
// 8 - 구현 처리 완료 카카오도 해주자!
public class NaverPay implements Pay{
    public boolean pay(int amount) {
        System.out.println("네이버페이 시스템과 연결합니다.");
        System.out.println(amount + "원 결제를 시도합니다.");
        return true;
    }
}
