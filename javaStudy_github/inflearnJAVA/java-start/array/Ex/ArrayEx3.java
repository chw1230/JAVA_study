package array.Ex;

import java.util.Scanner;

public class ArrayEx3 {
    public static void main(String[] args) {
        int[] students = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("5개의 정수를 입력하시오: ");
        for(int i = 0 ;i<students.length;i++){
            int num = input.nextInt();
            students[i] = num;
            // student[i] = input.nextInt(); --> 이와 같이 적어도 됨!!
        }

        System.out.println("입력한 정수를 역순으로 출력: ");
        for ( int i = (students.length-1) ; i >= 0; i--){
            System.out.print(students[i]);
            if( i != 0 ){
                System.out.print(",");
            }
        }
    }
}
