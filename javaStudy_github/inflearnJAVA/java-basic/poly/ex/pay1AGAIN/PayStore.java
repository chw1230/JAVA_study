package poly.ex.pay1AGAIN;

public abstract class PayStore {
    // 25 - 메서드 선언해주기 이때 static으로 선언해주고 PayStore는 다른 것들은 생성하지 않을 것이기 때문에 abstract 처리 해준다!
    public static Pay findPay(String option){
        Pay pay;
        if (option.equals("kakao")) {
            return new KakaoPay();
        } else if (option.equals("naver")) {
            return new NaverPay();
        }else if (option.equals("kb")) {
            return new KBPay();
        } else if (option.equals("toss")) {
            return new TossPay();
        } else {
            pay = null; // 16 - pay = null 해주기
            System.out.println("결제 수단이 없습니다.");
            return new DefalutPay();
        }
        //34 - 리턴값 수정 완료!
    }
}
