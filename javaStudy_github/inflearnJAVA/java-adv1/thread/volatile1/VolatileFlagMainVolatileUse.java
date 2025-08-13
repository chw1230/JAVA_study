package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileFlagMainVolatileUse {
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

//        boolean runFlag = true;
        volatile boolean runFlag = true;
        // 캐시 메모리를 사용하면 CPU 처리 성능을 개선할 수 있지만
        // 때로는 이런 성능 향상보다는, 여러 스레드에서 같은 시점에 정확히 같은 데이터를 보는 것이 더 중요할 수 있다.
        // 이럴 때 사용하는 것이 volatile 키워드이다!
        // funFlag - 캐시 메모리를 사용하지 않고, 값을 읽거나 쓸 때 항상 메인 메모리에 직접 접근

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
