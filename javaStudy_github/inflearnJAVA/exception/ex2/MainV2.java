package exception.ex2;

import java.util.Scanner;

public class MainV2 {

    public static void main(String[] args) throws NetworkClientExceptionV2 {
//        NetworkServiceV2_1 networkService = new NetworkServiceV2_1();
//        NetworkServiceV2_2 networkService = new NetworkServiceV2_2();
//        NetworkServiceV2_3 networkService = new NetworkServiceV2_3();
//        NetworkServiceV2_4 networkService = new NetworkServiceV2_4();
        NetworkServiceV2_5 networkService = new NetworkServiceV2_5();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("전송할 문자: ");
            String input = scanner.nextLine();
            if (input.equals("exit")) {
                break;
            }
            networkService.sendMessage(input); // 얘 도 오류나면 던져버려! -> main throws NetworkClientExceptionV2 코드 추가하기!
            System.out.println();
        }
        System.out.println("프로그램을 정상 종료합니다.");
    }
    // 근데 의문!! 연결에 실패하면 데이터 전송을 하면 안된다고 했는데
    // 연결에 실패해도 데이터 전송함! 데이터를 전송하지 않도록 바꾸기!!
}
