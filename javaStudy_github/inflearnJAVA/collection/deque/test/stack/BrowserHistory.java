package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;
//    문제2 - 브라우저 히스토리 관리
public class BrowserHistory {
    Deque<String> deque = new ArrayDeque<>();


    public void visitPage(String s) {
        System.out.println("방문: " + s);
        deque.push(s);
    }

    public String goBack() {
        deque.pop();
        System.out.println("뒤로 가기: " + deque.peek());
        return deque.peek();
    }
}
