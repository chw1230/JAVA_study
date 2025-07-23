package thread.control.interrupt;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadStopMainV3 {

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
            while (!Thread.currentThread().isInterrupted()) { // 인터럽트 상태를 확인! 변경하지는 않음
                log("작업 중");
            }
            log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted()); // true가 나옴 sleep에서 인터럽트예외가 발생해서 밖에서 확인하면 false가 나오지만 그런 상황이 아니기 때문에!
            // 인터럽트 상태이기에 while 문 탈출!

            // 계속 인터럽트가 ture로 유지 된 상태!
            try {
                log("자원 정리 시도");
                Thread.sleep(1000); // -> 여기에서 인터럽트 예외가 발생함! => 다시 예외를 잡는 구간으로 이동하게 됨
                log("자원 정리 완료");
            } catch (InterruptedException e) {
                log("자원 정리 실패 - 자원 정리 중 인터럽트 발생");
                log("work 스레드 인터럽트 상태3 = " + Thread.currentThread().isInterrupted());
            }
            log("작업 종료");
        }
        /* 이 코드의 문제점 :
        우리가 while 문에서 인터럽트 발생 여부를 확인한 이유 -> while 탈출에 한번만 사용하기 위해서
        하지만 지금 while문을 탈출 하고서도 인터럽트가 여전히 ture임!!
        그래서 sleep 코드에 영향을 주게 된다!! 그래서 자원 정리 과정 중간에 오류가 나서 종료되는 단점이 있음!
        그렇다면 우리는 어떻게 해야할까? whilie 에서 벗어나면 인터럽트를 다시 정상으로 돌려 놓아야한다.
         */

    }
}