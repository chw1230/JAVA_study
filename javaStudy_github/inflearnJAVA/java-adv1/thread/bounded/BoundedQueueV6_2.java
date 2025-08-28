package thread.bounded;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

import static util.MyLogger.log;

public class BoundedQueueV6_2 implements BoundedQueue {

    private BlockingQueue<String> queue;

    public BoundedQueueV6_2(int max) { // 버퍼의 사이즈 넣어줘야함!
        this.queue = new ArrayBlockingQueue<>(max);
    }

    ///  대기 시 즉시 반환
    // 기다리e고 그런 거 없이 즉시 가능하면 true 불가능 하면 기다리지 않고(데이터 소비와 저장을 위해서 기다리지 않고) false 반환
    @Override
    public void put(String data) {
        boolean result = queue.offer(data);
        log("저장 시도 결과 = " + result);
        // 지정된 요소를 큐에 추가하려고 시도하며, 성공하면 ture 큐가 가득 차면 false를 반환
    }

    @Override
    public String take() {
        return queue.poll();
        // 큐에서 요소를 제거하고 반환한다. 큐가 비어 있으면 즉시 null을 반환
    }

    @Override
    public String toString() {
        return queue.toString();
    }
}
