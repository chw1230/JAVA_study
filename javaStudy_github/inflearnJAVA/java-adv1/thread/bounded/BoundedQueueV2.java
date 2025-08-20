package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedQueueV2 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV2(int max) {
        this.max = max;
    }

    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) { // 언제가는 소비자가 가져가 큐가 비길 기다리기
            log("[put] 큐가 가득 참, 생산자 대기");
            sleep(1000);
        }
        queue.offer(data);
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()) { // 언제가는 생산자가 값을 넣어 큐가 차길 기다리기
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            sleep(1000);
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
