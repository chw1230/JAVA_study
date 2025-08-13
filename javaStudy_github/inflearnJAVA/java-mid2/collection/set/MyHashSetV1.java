package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        initBuckets();
    }

    public MyHashSetV1(int capacity) { // capacity 값 조절
        this.capacity = capacity;
        initBuckets();
    }

    public void initBuckets() { // 값 초기화
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public  boolean add(int value){
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex];  // O(1)
        if (bucket.contains(value)) {  // O(n) 이지만 데이터가 1개 또는 2개만 들어잇음 그래서 평균적으로 O(1)이 됨!!!
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(int searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<Integer> bucket = buckets[hashIndex];  // O(1)
        return bucket.contains(searchValue);  // O(n) 이지만 데이터를 분산시켰기 때문에 거의 1개 또는 2개가 들어있음 그래서 평균적으로 O(1)
    }

    public boolean remove(int value) {
        int hashIndex = hashIndex(value);
        LinkedList<Integer> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(Integer.valueOf(value)); // O(n) 이지만 데이터를 분산시켰기 때문에 거의 1개 또는 2개가 들어있음 그래서 평균적으로 O(1)
        // 버킷 안에 있는 값을 찾아서 지우는 remove 사용!!!!!!
        // 그냥 remove에 숫자를 넣으면 해당 숫자의 인덱스의 값을 삭제함!!
        if (result) {
            size--;
            return true;
        }
        else {
            return false;
        }
    }

    private int hashIndex(int value){
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
