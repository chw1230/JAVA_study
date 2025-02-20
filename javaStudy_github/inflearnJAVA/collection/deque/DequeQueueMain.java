package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeQueueMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // 큐만 쓴다고 제한해야하는 상황이라면
        // Queue<Integer> deque = new ArrayDeque<>(); 이렇게 사용해도 무방 !!
        // 하지만 스택은 안됨!

        // 데이터 추가 ( 큐의 경우 )
        deque.offer(1);
        deque.offer(2);
        deque.offer(3);
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이터 확인 ( 꺼내지 않고 그냥 단수 조회 )
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println("deque.poll() = " + deque.poll());
        System.out.println(deque);
    }
}
