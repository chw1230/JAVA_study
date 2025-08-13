package nested.anonymous.ex;

import java.util.Random;

public class Ex1RefMainV3 {

    public static void hello(Process process) {
        System.out.println("프로그램 시작");

        // 구현체에 뭐가  오느냐에따라 다름
        process.run();

        System.out.println("프로그램 종료");
    }

    public static void main(String[] args) {

        Process dice = new Process() { // 익명 클래스 생성
            @Override
            public void run() {
                // 코드 조각
                int randomValue = new Random().nextInt(6) + 1;
                System.out.println("주사위 = " + randomValue);
            }
        };

        Process sum = new Process() { // 익명 클래스 생성
            @Override
            public void run() {
                // 코드 조각
                for (int i = 0; i < 3; i++) {
                    System.out.println("i = " + i);
                }
            }
        };

        hello(dice);
        hello(sum);
    }
}
