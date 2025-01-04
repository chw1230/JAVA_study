package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV4 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {
        /*
        Process dice = new Process() { // 익명 클래스 생성
        ㄴ---> 여기 처럼 객체에 담지 말고 함수에다가 new Process() {~}를 넣어주기!!!!
            @Override
            public void run() {
                // 코드 조각
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() { // 익명 클래스 생성
        ㄴ---> 여기 처럼 객체에 담지 말고 함수에다가 new Process() {~}를 넣어주기!!!!
            @Override
            public void run() {
                // 코드 조각
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };
        */

        // 메서드의 인스로 통으로 전달!!
        hello(new Process() {
            @Override
            public void run() {
                // 코드 조각
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        });

        // 메서드의 인스로 통으로 전달!!
        hello(new Process() {
            @Override
            public void run() {
                // 코드 조각
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        });
    }
}
