package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class HashStart5 {

    public static int CAPACITY = 10;

    static int hashIndex(int v) {
        return v % CAPACITY;
    }


    public static void main(String[] args) {
        // {1,2,5,8,14,99}
        LinkedList<Integer>[] buckets = new LinkedList[CAPACITY]; // LinkedList를 넣을 수 있는 Integer 배열 생성
        System.out.println("buckets = " + Arrays.toString(buckets));
        for (int i = 0; i < CAPACITY; i++) {
            buckets[i] = new LinkedList<>();
        }
        add(buckets,1);
        add(buckets,2);
        add(buckets,5);
        add(buckets,8);
        add(buckets,14);
        add(buckets,99);
        add(buckets,9);  // 해시 충돌의 경우 추가하기
        System.out.println("buckets = " + Arrays.toString(buckets));

        // 검색
        int searchValue = 9;
        boolean contains = contains(buckets, searchValue);
        System.out.println("buckets.contains("+searchValue+") = " + contains);
    }

    private static void add(LinkedList<Integer>[] buckets , int value) {
        int hashIndex = hashIndex(value);  // 매개변수를 통해서 전달 받은 값으로 해시 인덱스 만들기
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        if (!bucket.contains(value)) { // O(n) 중복 확인
            bucket.add(value);
        }
    }

    private static boolean contains(LinkedList<Integer>[] buckets, int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }
}
