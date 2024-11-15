package poly.ex.pay2;

public abstract class PayStore {
    // 변하는 부분
    public static Pay findPay(String option){
        Pay pay;
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }  else if (option.equals("kb")) {
            return new KBPay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
            return new DefaultPay();
        }
    }
}
