package array.Ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = input.nextInt();
        int[] num = new int[cnt];
        System.out.println("정수 "+cnt+"개를 입력하시오: ");
        for(int i = 0 ;i<num.length;i++){
            num[i] = input.nextInt();
            total += num[i];
        }
        double avg = total / cnt;

        System.out.println("입력한 정수의 합계: "+ (int)total);
        System.out.println("입력한 정수의 평균: "+ avg);
    }
}
