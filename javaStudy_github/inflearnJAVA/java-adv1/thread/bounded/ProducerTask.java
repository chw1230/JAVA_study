package thread.bounded;

import static util.MyLogger.log;

public class ProducerTask implements Runnable{

    private BoundedQueue queue;
    private String request;

    public ProducerTask(BoundedQueue queue, String request) { // 어떤 큐에 어떤 데이터 넣을지
        this.queue = queue;
        this.request = request;
    }

    @Override
    public void run() {
        log("[생산 시도] " + request + " -> " + queue);
        queue.put(request);
        log("[생산 완료] " + request + " -> " + queue);
    }
}
