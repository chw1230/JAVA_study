package thread.start.test;

import static util.MyLogger.log;

public class StartTest4Main {
    public static void main(String[] args) {
        /*
        // 객체 생성
        PrintWorker a = new PrintWorker("A", 1000);
        PrintWorker b = new PrintWorker("B", 500);

        // 생성한 객체를 이용하여 스레드 객체 생성
        Thread threadA = new Thread(a, "Thread-A");
        Thread threadB = new Thread(b, "Thread-B");
         */

        // 리펙토링
        Thread threadA = new Thread(new PrintWorker("A", 1000), "Thread-A");
        Thread threadB = new Thread(new PrintWorker("B", 500), "Thread-B");

        // 스레드 실행
        threadA.start();
        threadB.start();
    }

    // 문제에서 요구하는 두 쓰레드의 작업이 비슷하니까 하나 안에서 처리하기
    static class PrintWorker implements Runnable {
        // 스레드 이름과 지연 시간
        private String content;
        private int sleepMs;

        public PrintWorker(String content, int sleepMs) {
            this.content = content;
            this.sleepMs = sleepMs;
        }

        @Override
        public void run() {
            // 무한 반복문
            while (true) {
                log(content);
                try {
                    Thread.sleep(sleepMs);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
