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

/*
    wait() - 현재 스레드가 가진 락을 다른 스레드가 획득 할 수 있도록 반납하고 대기(WAITING) 하기 다른 스레드가 notify()나 notifyAll() 호출할 때까지 대기
    notify() - 대기 중인 스레드 중 하나를 깨우기, 여러개 라면 여러개 중 무작위 하나 / 깨운 스레드는 락을 다시 획득할 수 있음

    notify()의 비효율 문제점
    notify()의 결과로 같은 종류의 스레드를 꺠울 때 비효율이 발생한다.

    스레드 기아 문제점
    이론상 notify()가 어떤 스레드를 깨울지 알 수 없기 때문에 같은 종류의 스레드만 계속 깨운다면
    스레드가 실행 순서를 계속 얻지 못해서 실행되지 않는 스레드 기아 상태가 될 수 있다.
    -> 이러한 문제를 해결하기 위해서 notifyAll() 사용한다!
    -> 스레드 대기 집합에 있는 모든 스레드를 한번에 다 깨울 수 있음
    -> 깨어난 스레드는 락을 얻기 위해 임계영역에서 BLOCKED으로 있으며 락을 얻게된다.
    -> 이때 같은 종류의 스레드라면 다시 스레드 대기 집합으로 이동할 것 이고, 다른 스레드면 락을 획득하게 될 것
    => notifyAll() - 스레드 기아를 막을 수 있지만, 비효율 문제를 막을 수 없음!
*/
