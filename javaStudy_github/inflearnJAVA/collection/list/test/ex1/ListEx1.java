package collection.list.test.ex1;

import java.util.ArrayList;
import java.util.List;

public class ListEx1 {

    // ArrayEx1에서 배열대신 리스트를 사용하도록 코드 수정하기
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();

        arrayList.add(90);
        arrayList.add(80);
        arrayList.add(70);
        arrayList.add(60);
        arrayList.add(50);

        int sum = 0;
        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i);
        }
        double average = (double) sum / arrayList.size();
        System.out.println("점수 총합: " + sum);
        System.out.println("점수 평균: " + average);
    }
}
