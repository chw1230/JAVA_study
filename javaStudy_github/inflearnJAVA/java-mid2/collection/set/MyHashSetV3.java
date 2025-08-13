package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets; // 모든 데이터를 다 담을 수 있도록 수정하기!!!!!!

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        initBuckets();
    }

    public MyHashSetV3(int capacity) { // capacity 값 조절
        this.capacity = capacity;
        initBuckets();
    }

    public void initBuckets() { // 값 초기화
        buckets = new LinkedList[capacity];
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public  boolean add(E value){
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex];  // O(1)
        if (bucket.contains(value)) {  // O(n) 이지만 데이터가 1개 또는 2개만 들어잇음 그래서 평균적으로 O(1)이 됨!!!
            return false;
        }

        bucket.add(value);
        size++;
        return true;
    }

    public boolean contains(E searchValue) {
        int hashIndex = hashIndex(searchValue);
        LinkedList<E> bucket = buckets[hashIndex];  // O(1)
        return bucket.contains(searchValue);  // O(n) 이지만 데이터를 분산시켰기 때문에 거의 1개 또는 2개가 들어있음 그래서 평균적으로 O(1)
    }

    public boolean remove(E value) {
        int hashIndex = hashIndex(value);
        LinkedList<E> bucket = buckets[hashIndex]; // O(1)
        boolean result = bucket.remove(value); // 기존의 Integer 형식으로 바꾸던 코드에서 Object로 입력 받을 것이기 때문에 그냥 value 넘겨주기!
        if (result) {
            size--;
            return true;
        }
        else {
            return false;
        }
    }

    private int hashIndex(E value){
        return Math.abs(value.hashCode()) % capacity; // 해시코드 마이너스 나올 수 있으니 절대값 씌우기!
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV3{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
