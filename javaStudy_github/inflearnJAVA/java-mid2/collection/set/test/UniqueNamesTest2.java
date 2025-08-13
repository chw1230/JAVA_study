package collection.set.test;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class UniqueNamesTest2 {
    // 문제2 - 중복 제거와 입력 순서 유지
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};
        /*
        Set<Integer> set = new LinkedHashSet<>();

        for (Integer s : inputArr) {
            set.add(s);
        }
        이렇게 도 할 수 있지만 더 간단한 방법이 있음!!!
         */
        Set<Integer> set = new LinkedHashSet<>(List.of(inputArr)); // set 구현체 생성자에 List를 전달 할 수 있음

        for (Integer s : set) {
            System.out.println(s+" ");
        }
    }
}
