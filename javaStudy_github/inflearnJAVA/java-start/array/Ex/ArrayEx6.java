package array.Ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("입력받을 숫자의 개수를 입력하세요: ");
        int cnt = input.nextInt();
        int[] num = new int[cnt];
        System.out.println("정수 "+cnt+"개를 입력하시오: ");
        for(int i = 0 ;i<num.length;i++){
            num[i] = input.nextInt();
        }
        int max = num[0];
        int min = num[0];
        for (int i =0 ; i < num.length ; i++){
            if(num[i] >= max){
                max = num[i];
            }
            if (num[i] <= min) {
                min = num[i];
            }
        }

        System.out.println("가장 작은 정수: "+ max);
        System.out.println("가장 큰 정수: "+ min);
    }
}
