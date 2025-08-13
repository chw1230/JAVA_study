package thread.control;

import static util.MyLogger.log;

public class ThreadStateMain {

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable(), "myThread"); // 새로운 MyThread 스레드 생성
        log("myThread.state1 = " + thread.getState()); // 처음에 start 안했기 때문에 new가 나옴
        log("myThread.start()");
        thread.start();
        Thread.sleep(1000);
        log("myThread.state3 = " + thread.getState()); // TIME_WATTING
        Thread.sleep(4000);
        log("myThread.state5 = " + thread.getState()); // TERMINATED
        log("end");
    }


    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            try {
                log("start");
                log("myThread.state2 = " + Thread.currentThread().getState()); // start 했기 때문에 RUNNABLE이 나옴

                log("sleep() start");
                Thread.sleep(3000);
                log("sleep() end");

                log("myThread.state4 = " + Thread.currentThread().getState()); // RUNNABLE
                log("end");// 이 로그를 찍고 난 뒤 run() 메서드가 종료되어, 쓰레드는 TERMINATED 상태가 됨
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
