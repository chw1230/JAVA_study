package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedQueueV3 implements BoundedQueue {

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV3(int max) {
        this.max = max;
    }

    // Object - wait, notify의 사용
    @Override
    public synchronized void put(String data) {
        while (queue.size() == max) { // 큐가 가득찼다면 락을 반납하고 대기하기 (Object.wait() - 사용)
            log("[put] 큐가 가득 참, 생산자 대기");
            try {
                wait(); // RUNNABLE -> WAITING, 락 반납
                log("[put] 생산자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        queue.offer(data); // 데이터를 넣고 데이터를 기다리는 애를 깨우기!
        log("[put] 생산자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드, WAIT -> RUNNABLE
    }

    @Override
    public synchronized String take() {
        while (queue.isEmpty()) { // 언제가는 생산자가 값을 넣어 큐가 차길 기다리기
            log("[take] 큐에 데이터가 없음, 소비자 대기");
            try {
                wait();
                log("[take] 소비자 깨어남");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        String data = queue.poll();
        log("[take] 소비자 데이터 저장, notify() 호출");
        notify(); // 대기 스레드 하나가 WAIT -> BLOCKED / 근데 왜 BLOCKED이지??? -> 뒤에서!!
        return data;
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
