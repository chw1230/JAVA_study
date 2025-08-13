package thread.start.test;

import static util.MyLogger.log;

public class StartTest2Main {

    public static void main(String[] args) {
        /*
        CounterRunnable counterRunnable = new CounterRunnable();
        Thread thread = new Thread(counterRunnable); // 인스턴스를 이용하여 스레드 생성하기
        thread.setName("counter");
        thread.start();
         */

        /*
        // 리펙토링!
        Thread thread1 = new Thread(new CounterRunnable());
        thread1.setName("counter");
        thread1.start();
         */

        // 한번더! 리펙토링!
        Thread thread2 = new Thread(new CounterRunnable(), "counter");
        thread2.start();

    }

    public static class CounterRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 1; i <= 5; i++) {
                log("value: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
