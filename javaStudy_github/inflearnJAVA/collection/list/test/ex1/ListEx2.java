package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListEx2 {

    // ArrayEx1에서 배열대신 리스트를 사용하도록 코드 수정하기
    // ListEx1 코드 개선하기
//    사용자에게 n개의 정수를 입력받아서
//    List에 저장하고, 입력 순서대로 출력하자.
//    0 을 입력하면 입력을 종료하고 결과를 출력한다.
//    출력시 출력 포멧은 1, 2, 3, 4, 5와 같이
//    쉼표를 사용해서 구분하고, 마지막에는 쉼표를 넣지 않아야 한다.
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

        System.out.println("출력");
        for (int i = 0; i < arrayList.size(); i++) {
            if (i == arrayList.size() - 1) {
                System.out.print(arrayList.get(i));
            }else{
                System.out.print(arrayList.get(i)+", ");
            }
        }
    }
}
