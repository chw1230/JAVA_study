package exception.ex1;

import java.util.Scanner;

public class MainV1 {

    public static void main(String[] args) {
//        NetworkServiceV1_1 networkService = new NetworkServiceV1_1(); //_1 일때!
//        NetworkServiceV1_2 networkService = new NetworkServiceV1_2(); //_2 일때!
        NetworkServiceV1_3 networkService = new NetworkServiceV1_3(); //_3 일때!

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
    // 근데 의문!! 연결에 실패하면 데이터 전송을 하면 안된다고 했는데
    // 연결에 실패해도 데이터 전송함! 데이터를 전송하지 않도록 바꾸기!!
}
