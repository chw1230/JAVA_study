package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx3 {

    // ArrayEx1에서 배열대신 리스트를 사용하도록 코드 수정하기
    // ListEx2 코드 개선하기
//    사용자에게 n개의 정수를 입력받아서
//    List에 저장하고, 합계 평균 출력
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("n개의 정수를 입력하세요 (종료 0)");
        int n = 1;
        while (true){
            n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            arrayList.add(n);
        }

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        double average = (double) sum / arrayList.size();
        System.out.println("입력한 정수 총합: " + sum);
        System.out.println("입력한 정수 평균: " + average);
    }
}
