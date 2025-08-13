package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        log("runFlag = " + task.runFlag); // 처음에 true로 뜸 그래서 task 시작이라고 로그도 뜸!
        t.start(); // 스레드 시작

        sleep(1000);
        log("runFlag를 false로 변경 시도"); // true 를 false 로 변경 시도
        task.runFlag = false; // 변경 하고
        log("runFlag = " + task.runFlag); // 값도 출력해봤지만 -> while은 무한 반복에서 나오질 않음 => 코드 실행이 끝나질 않음
        log("main 종료");
        // 메모리 가시성 문제 발생! => 멀티 스레드 환경에서 한 스레드가 변경한 값이 다른 스레드에서 언제 보이는지에 대한 문제 (메모리에 변경한 값이 보이는가, 보이지 않는가)
        // main 메모리에서 runFlag 값을 변경해도 캐시 메모리의 값이 변경되는 것!!
        // 그래서 work 쓰레드는 처음에 캐시 메모리에 저장해둔 runFlag 값 true로 계속 무한 루프를 도는 것
    }

    static class MyTask implements Runnable {

        boolean runFlag = true;
//        volatile boolean runFlasg = true;

        @Override
        public void run() {
            log("task 시작");
            while(runFlag){ // 계속 돌아감!
                // runFlg가 false로 변하면 탈출
            }
            log("task 종료");
        }
    }
}
