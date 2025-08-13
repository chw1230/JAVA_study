package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {
        log("Start");
        SumTask sumTask1 = new SumTask(1, 50);
        Thread thread1 = new Thread(sumTask1, "Thread-1");

        thread1.start();

        // 스레드가 종료될 때 까지 특정 시간 만큼 대기하기
        log("join() - main 스레드 thread1 종료까지 1초 대기");
        thread1.join(1000); // thread1번이 종료될 때까지 main 쓰레드에서 대기하는 것!
        // main 쓰레드는 TIMED_WAITING 상태 이다!
        log("main 스레드 1초간 대기 완료");

        /*
        다른 스레드가 완료될 때까지 무한정 기다려야한다면 join() 사용,
        무한정 기다릴 수 없다면 join(ms)를 사용한다.
         */

        log("task1.result = " + sumTask1.result);
        log("End");

    }

    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result;

        public SumTask(int starValue, int endValue) {
            this.startValue = starValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            sleep(2000);
            int sum = 0;
            for (int i = startValue; i <=  endValue; i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 result = " + result);
        }
    }
}
