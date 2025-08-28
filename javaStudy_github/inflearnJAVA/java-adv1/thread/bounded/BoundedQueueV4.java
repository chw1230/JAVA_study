package thread.bounded;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;

public class BoundedQueueV4 implements BoundedQueue {

    private final Lock lock = new ReentrantLock();
    private final Condition condition = lock.newCondition(); // condition은 스레드가 대기하는 대기 집합

    private final Queue<String> queue = new ArrayDeque<>();
    private final int max;

    public BoundedQueueV4(int max) {
        this.max = max;
    }

    // Object - wait, notify의 사용
    @Override
    public void put(String data) {
        lock.lock();
        try {
            while (queue.size() == max) { // 큐가 가득찼다면 락을 반납하고 대기하기 (Object.wait() - 사용)
                log("[put] 큐가 가득 참, 생산자 대기");
                try {
                    condition.await(); // condition에 들어가서 기다리게 됨
                    log("[put] 생산자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            queue.offer(data); // 데이터를 넣고 데이터를 기다리는 애를 깨우기!
            log("[put] 생산자 데이터 저장, signal() 호출");
            condition.signal(); // 대기하던 스레드가 깨어남
        } finally {
            lock.unlock();
        }

    }

    @Override
    public String take() {
        lock.lock();
        try {
            while (queue.isEmpty()) { // 언제가는 생산자가 값을 넣어 큐가 차길 기다리기
                log("[take] 큐에 데이터가 없음, 소비자 대기");
                try {
                    condition.await();
                    log("[take] 소비자 깨어남");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            String data = queue.poll();
            log("[take] 소비자 데이터 저장, signal() 호출");
            condition.signal();
            return data;
        } finally {
            lock.unlock();
        }
    }

    /*
        Synchronized 대신에 Lock lock = new ReentrantLock 을 사용
        Condition => 스레드가 대기하는 공간
        Condition condition = lock.newCondition() 대기 공간 생성
        Object.wait과는 다르게 직접 대기공간을 만들어서 사용해야한다.

        + condition.await() 는 Object.wait() 와 유사한 기능이다. 획득한 락을 반납하고 지정한 condition에 현재 스레드를 대기 상태로 보관
        + condition.signal() 은 Object.notify 와 유사한 기능이다. condition에서 대기하는 스레드를 하나 깨움
     */

    @Override
    public String toString() {
        return queue.toString();
    }
}
