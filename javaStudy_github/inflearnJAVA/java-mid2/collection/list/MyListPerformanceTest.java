package collection.list;

import java.util.ArrayList;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("==MyArrayList 추가==");
        addFirst(new MyArrayList<>(),size);
        addMid(new MyArrayList<>(),size); // 찾기 O(1) + 옆으로 밀고 O(n) + 값넣기 O(1)
        MyArrayList<Integer> arrayList = new MyArrayList<>();  // 조회용 데이터로 사용
        addLast(arrayList,size);  // 찾기 O(1) + 마지막에 값 넣기 O(1)

        int loop = 10000;
        System.out.println("==MyArrayList 조회==");
        getIndex(arrayList,loop,0);  // 앞
        getIndex(arrayList,loop,size/2);  // 중간
        getIndex(arrayList,loop,size-1);  // 끝

        System.out.println("==MyArrayList 검색==");
        search(arrayList,loop,0);  // 앞
        search(arrayList,loop,size/2);  // 중간
        search(arrayList,loop,size-1);  // 끝


        System.out.println("==MyLinkedList 추가==");
        addFirst(new MyLinkedList<>(),size);
        addMid(new MyLinkedList<>(),size); // 찾기 O(n) + 값 넣기 O(1)
        MyLinkedList<Integer> linkedList = new MyLinkedList<>(); // 조회용 데이터로 사용
        addLast(linkedList,size); // 찾기 O(n) + 값 넣기 O(1)

        System.out.println("==MyLinkedList 조회==");
        getIndex(linkedList,loop,0);  // 앞
        getIndex(linkedList,loop,size/2);  // 중간
        getIndex(linkedList,loop,size-1);  // 끝

        System.out.println("==MyLinkedList 검색==");
        search(linkedList,loop,0);  // 앞
        search(linkedList,loop,size/2);  // 중간
        search(linkedList,loop,size-1);  // 끝
    }

    public static void addFirst(MyList<Integer> list, int size) { // 부모는 자식을 담을 수 있으니까 첨엔 ArrList, 두번째는 LikList가 됨
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("앞에 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    public static void addMid(MyList<Integer> list, int size) { // 부모는 자식을 담을 수 있으니까 첨엔 ArrList, 두번째는 LikList가 됨
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i/2, i); //  중간에 추가
        }
        long endTime = System.currentTimeMillis();
        System.out.println("중간에 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    public static void addLast(MyList<Integer> list, int size) { // 부모는 자식을 담을 수 있으니까 첨엔 ArrList, 두번째는 LikList가 됨
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i); // add는 마지막에 데이터를 추가함
        }
        long endTime = System.currentTimeMillis();
        System.out.println("마지막에 추가 - 크기: " + size + ", 계산 시간 " + (endTime - startTime) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (endTime-starTime) + "ms");
    }

    private static void search(MyList<Integer> list, int loop, int findValue) {
        long starTime = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.indexOf(findValue); // 자료가 있는지 찾기
        }
        long endTime = System.currentTimeMillis();
        System.out.println("index: " + findValue + ", 반복: " + loop + ", 계산 시간: " + (endTime-starTime) + "ms");
    }
}