package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV2 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(4000);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt(); // 인터럽트 발생 시키기 -> 중단 지시 하자마자 중단이 됨! 아까와는 다름! + sleep이나 wait 중이면 InterruptedException가 발생함
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            try {
                while (true) {
                    log("작업 중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) { // 인터럽트가 발생되면 인터럽트 에러가 발생해서 여기로 오게됨!
                log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted()); // false 나옴 인터럽트가 걸려서 에러로 나오게 되면 기존의 상태로 돌아옴! -> runnable
                log("interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }
            log("자원 정리");
            log("자원 종료");
        }
    }
}
