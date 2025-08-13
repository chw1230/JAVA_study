package poly.ex.pay2;

import java.util.Scanner;

public class PayMain2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();


        while (true){
            System.out.println("----결제수단----");
            System.out.println("kakao | naver | kb | toss | exit -> 프로그램 종료");
            System.out.print("결제 수단을 입력하세요: ");
            String option = sc.nextLine();
            if(option.equals("exit")){
                System.out.println("프로그램이 종료됩니다.");
                break;
            }
            System.out.print("결제 금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine();
            payService.processPay(option, amount);
        }

    }
}
