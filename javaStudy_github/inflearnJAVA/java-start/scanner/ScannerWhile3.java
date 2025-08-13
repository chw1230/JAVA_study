package scanner;

import java.util.Scanner;

public class ScannerWhile3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true){
            System.out.print("숫자를 입력하시오: ");
            int n1 = scanner.nextInt();

            if(n1 == 0){
                System.out.println("0을 입력하였습니다.\n프로그램이 종료됩니다.");
                break;
            }
            sum = sum + n1;
        }
        System.out.println("모든 정수의 합 : " + sum);
    }
}
