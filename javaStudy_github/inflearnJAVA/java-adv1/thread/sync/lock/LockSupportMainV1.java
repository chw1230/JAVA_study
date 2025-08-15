package thread.sync.lock;

import java.util.concurrent.locks.LockSupport;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class LockSupportMainV1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new ParkTest(), "Thread-1");
        thread1.start();

        // 잠시 대기하여 Thread-1이 park 상태에 빠질 시간 주기
        sleep(100);
        log("Thread-1 state: " + thread1.getState()); // park에 들어고 상태를 확인하니까 WAITING이 나옴

        // main 스레드가 unpark 호출
        log("main -> unpark(Thread-1)");
        LockSupport.unpark(thread1); // 1. unpark 사용 => WAITING에서 다시 RUNNABLE이 됨!

        // thread1 인터럽트 걸기
//        log("Thread1 interrupt 걸기");
//        thread1.interrupt(); // 2. interrupt() 사용 => WAITING에서 다시 RUNNABLE이 됨! / WAITING 상태의 스레드는 인터럽트를 걸어서 중간에 깨울 수 있음
    }




    static class ParkTest implements Runnable {

        @Override
        public void run() {
            log("park 시작");
            LockSupport.park(); // park 호출 해서 호출한 스레드가 대기 상태에 빠지게 됨!
            log("park 종료, state: " + Thread.currentThread().getState());
            log("인터럽트 상태: " + Thread.currentThread().isInterrupted());
        }
    }
}