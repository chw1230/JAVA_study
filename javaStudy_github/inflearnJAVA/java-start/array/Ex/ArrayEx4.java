package array.Ex;

import java.util.Scanner;

public class ArrayEx4 {
    public static void main(String[] args) {
        int[] num = new int[5];
        Scanner input = new Scanner(System.in);
        double total = 0;

        System.out.println("5개의 정수를 입력하시오: ");
        for(int i = 0 ;i<num.length;i++){
            num[i] = input.nextInt();
            total += num[i];
        }
        double avg = total / 5;

        System.out.println("입력한 정수의 합계: "+ (int)total);
        System.out.println("입력한 정수의 평균: "+ avg);
    }
}
