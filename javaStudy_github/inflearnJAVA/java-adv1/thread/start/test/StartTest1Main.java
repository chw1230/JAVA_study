package thread.start.test;

import static util.MyLogger.log;

public class StartTest1Main {
    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread(); // 해당 클래서에서 만 사용되기에 중첩 클래스 사용, 객체 생성하기
        counterThread.start(); // Thread 상속 방식 이니까 .start()하기
    }

    static class CounterThread extends Thread {
        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) { // 1초 부터 5초 까지
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
