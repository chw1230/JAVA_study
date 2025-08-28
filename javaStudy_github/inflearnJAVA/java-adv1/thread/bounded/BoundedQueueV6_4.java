package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

import static util.MyLogger.log;

public class BoundedQueueV6_4 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_4(int max) { // 버퍼의 사이즈 넣어줘야함!
        this.queue = new ArrayBlockingQueue<>(max);
    }

    ///  특정 시간 만큼만 대기
    @Override
    public void put(String data) {
        queue.add(data); // 성공하면 ture, 버퍼가 가득 차면 예외 - java.lang.IllegalStateException: Queue full 발생
    }

    @Override
    public String take() {
        return queue.remove(); // 버퍼에 데이터가 없으면 즉시 예외 - java.util.NoSuchElementException 발생
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
