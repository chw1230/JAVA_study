package scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while(true) {
            System.out.print("이름을 입력하세요(종료 입력하면 종료): ");
            String name = input.nextLine();
            if(name.equals("종료")){
                System.out.println("프로그램 종료");
                break;
            }
            System.out.print("나이를 입력하세요: ");
            int age = input.nextInt(); // nextInt는 숫자만 가져옴 !!! 엔터를 쳤을 때의 엔터를 먹어줄 코드가 필요
            input.nextLine(); //  엔터를 먹어줄 코드

            System.out.println("이름: "+name+", 나이: "+age);
        }
    }
}
