package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV4 {

    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(100);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt(); // 인터럽트 발생 시키기 -> 중단 지시 하자마자 중단이 됨! 아까와는 다름!
        log("work 스레드 인터럽트 상태1 = " + thread.isInterrupted());
    }

    static class MyTask implements Runnable {

        @Override
        public void run() {
            // Thread.interrupted() -> 이용!
            while (!Thread.interrupted()) { // 인터럽트 상태를 확인! + 인터럽트 활성화이면 비활성화, 비활성화이면 비활성화를 유지 해준다.
                log("작업 중");
            }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted()); // 인터럽트가 false가 나옴!

            try {
                log("자원 정리 시도");
                Thread.sleep(1000); // -> 여기에서 인터럽트 예외 발생하지 않음!
                log("자원 정리 완료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
    }
}