package scanner;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.print("숫자1를 입력하시오: ");
            int n1 = scanner.nextInt();
            System.out.print("숫자2를 입력하시오: ");
            int n2 = scanner.nextInt();
            int sum = n1 + n2;

            if(sum == 0){
                System.out.println("두 수의 합이 0입니다.\n프로그램이 종료됩니다.");
                break;
            }
            System.out.println("두 수의 합 : " + sum);
        }
    }
}
