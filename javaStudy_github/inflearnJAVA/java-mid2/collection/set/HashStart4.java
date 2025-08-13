package collection.set;

import java.util.Arrays;

public class HashStart4 {

    public static int CAPACITY = 10;

    static int hashIndex(int v) {
        return v % CAPACITY;
    }

    public static void main(String[] args) {
        // {1,2,5,8,14,99}
        System.out.println("hashIndex(1) = " + hashIndex(1));
        System.out.println("hashIndex(2) = " + hashIndex(2));
        System.out.println("hashIndex(5) = " + hashIndex(5));
        System.out.println("hashIndex(8) = " + hashIndex(8));
        System.out.println("hashIndex(14) = " + hashIndex(14));
        System.out.println("hashIndex(9) = " + hashIndex(9));

        // 배열에 데이터 삽입
        Integer[] inputArray = new Integer[CAPACITY];
        add(inputArray,1);
        add(inputArray,2);
        add(inputArray,5);
        add(inputArray,8);
        add(inputArray,14);
        add(inputArray,99);

        System.out.println("inputArray = " + Arrays.toString(inputArray));

        // 검색
        int searchValue = 14;
        int hashIndex = hashIndex(14);
        System.out.println("searchValue hashIndex : " + hashIndex);
        Integer result = inputArray[hashIndex];  // O(1)
        System.out.println(result);
    }

    private static void add(Integer[] inputArray , int value) {
        int hashIndex = hashIndex(value);  // 매개변수를 통해서 전달 받은 값으로 해시 인덱스 만들기
        inputArray[hashIndex] = value;   // 인덱스는 해시인덱스를 사용하고 값은 매개변수로 전달 받은 값을 사용하기
    }
}
