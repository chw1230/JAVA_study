package scanner.Ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        double cnt = 0.0;

        while(true) {
            System.out.print("수를 입력하세요(-1 입력하면 종료): ");
            int n = input.nextInt();
            if(n == -1){
                System.out.println("프로그램 종료");
                break;
            }
           sum += n;
            cnt++;
        }
        double avg = sum / cnt;

        System.out.println("입력한 숫자들의 합계: " + sum);
        System.out.println("입력한 숫자들의 평균: " + avg);
    }
}
