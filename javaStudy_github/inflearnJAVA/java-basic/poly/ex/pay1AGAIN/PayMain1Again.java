package poly.ex.pay1AGAIN;

// pay1 pakage에 있는 내용을 다시 한번더 복습하기!!!!
// 해설지 처럼 작성해보자!!
public class PayMain1Again {
    public static void main(String[] args) {
        // 1 - main코드를 보고서 어떻게 흘러가는지 확인
        PayService payService = new PayService(); // 2- PayService 참조 하는 구나!
        //kakao 결제
        String payOption1 = "kakao";
        int amount1 = 5000;
        payService.processPay(payOption1, amount1); // 3 -해당 클래스로 이동하기
        //naver 결제
        String payOption2 = "naver";
        int amount2 = 10000;
        payService.processPay(payOption2, amount2);
        //잘못된 결제 수단 선택
        String payOption3 = "bad";
        int amount3 = 15000;
        payService.processPay(payOption3, amount3);
        String payOption4 = "kb";
        int amount4 = 10000;
        payService.processPay(payOption4, amount4);
        String payOption5 = "toss";
        int amount5 = 10000;
        payService.processPay(payOption5, amount5);
    }
}
