package thread.bounded;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BoundedMain {

    public static void main(String[] args) {
        // 1. BoundedQueue 선택
//        BoundedQueue queue = new BoundedQueueV1(2); // V1의 문제 -> 소비와 생산에서 공통적인? 대칭적인? 문제 발생
//        BoundedQueue queue = new BoundedQueueV2(2); // V2의 문제 -> synchronized의 락으로 인한 문제
//        BoundedQueue queue = new BoundedQueueV3(2); // V3의 문제 -> notify( )의 비효율의 아쉬운 점 존재
        BoundedQueue queue = new BoundedQueueV4(2); // V4 ReentrantLock과 condition의 사용 -> 아직 대기 집합을 분리하지 않아 비효율 문제 발생
//        BoundedQueue queue = new BoundedQueueV5(2); // V4 ReentrantLock과 condition의 사용하여 대기 집합을 2개로 분리 하여 비효율성 문제 해결


        // 2. 생산자, 소비자 실행 순서 선택, 반드시 하나만 선택!
//        producerFirst(queue); // 생산자 먼저 실행
        consumerFirst(queue); // 소비자 먼저 실행
    }

    private static void producerFirst(BoundedQueue queue) {
        log("== [생산자 먼저 실행] 시작, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startProducer(queue, threads);
        printAllState(queue, threads);
        startConsumer(queue, threads);
        printAllState(queue, threads);
        log("== [생산자 먼저 실행] 종료, " + queue.getClass().getSimpleName() + " ==");
    }

    private static void consumerFirst(BoundedQueue queue) {
        log("== [소비자 먼저 실행] 시작, " + queue.getClass().getSimpleName() + " ==");
        List<Thread> threads = new ArrayList<>();
        startConsumer(queue, threads);
        printAllState(queue, threads);
        startProducer(queue, threads);
        printAllState(queue, threads);
        log("== [소비자 먼저 실행] 종료, " + queue.getClass().getSimpleName() + " ==");
    }


    private static void printAllState(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("현재 상태 출력, 큐 데이터: " + queue);
        for (Thread thread : threads) {
            log(thread.getName() + ": " + thread.getState());
        }
    }

    private static void startProducer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("생산자 시작");
        for (int i = 0; i < 3; i++) {
            Thread producer = new Thread(new ProducerTask(queue, "data" + i),"producer" + i);
            threads.add(producer);
            producer.start();
            sleep(100);
        }
    }

    private static void startConsumer(BoundedQueue queue, List<Thread> threads) {
        System.out.println();
        log("소비자 시작");
        for (int i = 1; i <= 3; i++) {
            Thread consumer = new Thread(new ConsumerTask(queue),"consumer" + i);
            threads.add(consumer);
            consumer.start();
            sleep(100);
        }
    }
}
