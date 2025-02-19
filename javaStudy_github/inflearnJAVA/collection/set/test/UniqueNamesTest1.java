package collection.set.test;

import java.util.HashSet;
import java.util.Set;

public class UniqueNamesTest1 {
    // 문제1 - 중복 제거
    public static void main(String[] args) {
        Integer[] inputArr = {30, 20, 20, 10, 10};

        Set<Integer> set = new HashSet<>();
        for (Integer integer : inputArr) {
            set.add(integer);
        }


        for (Integer s : set) {
            System.out.println(s + " ");
        }
    }
}
