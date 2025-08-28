package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static util.MyLogger.log;

public class BoundedQueueV6_3 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_3(int max) { // 버퍼의 사이즈 넣어줘야함!
        this.queue = new ArrayBlockingQueue<>(max);
    }

    ///  특정 시간 만큼만 대기
    @Override
    public void put(String data) {
        boolean result = false;
        try {
            result = queue.offer(data,1, TimeUnit.NANOSECONDS);
            log("저장 시도 결과 = " + result);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 특정 시간 동안만 기다리기
    }

    @Override
    public String take() {
        try {
            return queue.poll(2, TimeUnit.SECONDS); // 2초간 대기
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        // 특정 시간 동안만 기다리기
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
