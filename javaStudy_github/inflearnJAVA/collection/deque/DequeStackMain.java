package collection.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeStackMain {

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        // Stack<Integer> deque = new ArrayDeque<>(); 이런식의 사용 불가능!!

        // 데이터 추가 ( 스택의 경우 )
        deque.push(1);
        deque.push(2);
        deque.push(3);
        System.out.println("deque = " + deque);

        // 다음 꺼낼 데이터 확인 ( 꺼내지 않고 그냥 단수 조회 )
        System.out.println("deque.peek() = " + deque.peek());

        // 데이터 꺼내기
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println("deque.pop() = " + deque.pop());
        System.out.println(deque);
    }
}
