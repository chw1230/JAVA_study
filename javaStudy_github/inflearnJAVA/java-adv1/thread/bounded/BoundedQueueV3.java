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

    @Override
    public String toString() {
        return queue.toString();
    }
}
