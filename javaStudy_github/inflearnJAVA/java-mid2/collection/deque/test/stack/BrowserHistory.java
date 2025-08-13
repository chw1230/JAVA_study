package collection.deque.test.stack;

import java.util.ArrayDeque;
import java.util.Deque;
//    문제2 - 브라우저 히스토리 관리
public class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();
    String current = null; // 현재 페이지를 의미하는  변수 생성


    public void visitPage(String url) {
        if(current != null){ // 현재 페이지가 있으면 deque에 그 값을 넣어주기!
            history.push(current);
        }
        current = url; // 넘어온 url을 현재 페이지에 넘겨줌!
        // 그러면 다음 번에 visitPage가 호출되어 그떄 가면 현재 페이지가 달라진 것을 알 수 있을 것!!
        System.out.println("방문: " + url);
    }

    public String goBack() {
        if (!history.isEmpty()) { // history 가 비어있지 않다면
            // 뒤로가기 했을 때 그 현재 페이지가 달라진 것을 알 수 있어야함!!
            current = history.pop();
            System.out.println("뒤로 가기: " + current);
            return current;
        }
        return null;
    }
}
