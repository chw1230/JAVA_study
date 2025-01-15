package exception.ex4;

import exception.ex4.exception.SendExceptionV4;

import java.util.Scanner;

public class MainV4 {

    public static void main(String[] args) {
//        NetworkServiceV4 networkService = new NetworkServiceV4();
        NetworkServiceV5 networkService = new NetworkServiceV5();


        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }

            try { // 여기에서 공통 예외 처리 로직을 돌릴 것임!
                networkService.sendMessage(input);
            } catch (Exception e) {
                exceptionHandler(e);
            }
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }

    // 공통 예외 처리 메서드
    private static void exceptionHandler(Exception e) {
        System.out.println("사용자 메시지: 죄송합니다. 알 수 없는 문제가 발생하였습니다.");
        System.out.println("== 개발자용 디버깅 메시지 ==");
         // e.printStackTrace(System.out); // 스택 트레이스 출력 -> 실습과정에서만 사용
        // 실제사용(일반적인 사용)
        e.printStackTrace();

        // 필요하면 예외 별로 별도의 추가 처리 가능!! -> 공통 처리를 한다 하더라도 인스턴스가 넘어 오기 때문에 예외를 분류해서 별도의 추가 처리 가능!
        if (e instanceof SendExceptionV4 sendEx) {
            System.out.println("[전송 오류] 전송 데이터: " + sendEx.getSendData());
        }
    }
}
