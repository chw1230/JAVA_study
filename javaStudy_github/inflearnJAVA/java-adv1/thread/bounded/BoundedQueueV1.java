package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;

public class BoundedQueueV1 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV1(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        if ( queue.size() == max ) {
            log("[put] 큐가 가득 참, 버림 : " + data);
            return;
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        if (queue.isEmpty()) {
            return null;
        }

        return queue.poll();
    }

    /* 주의
    어떤 스레드가 put 메서드를 사용하고 있다면 take 메서드도 사용할 수 없는 것
    두 메서드에 synchronized 키워드가 붙어 있기 때문에!
    메서드 진입 시에 락을 획득하게 됨! 이 락은 객체당 하나 이므로
    어떤 스레드가 메서드를 사용 중이면 이미 락을 획득해서 사용중인 것!
    다른 메서드를 실행하려면 해당 메서드의 작업이 종료되어야 함!
     */

    @Override
    public String toString() {
        return queue.toString();
    }
}
