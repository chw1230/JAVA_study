package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV2 {
    public static void main(String[] args) {
        log("Start");
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);
        Thread thread1 = new Thread(sumTask1, "Thread-1");
        Thread thread2 = new Thread(sumTask2, "Thread-2");

        thread1.start();
        thread2.start();

        // sleep 을 이용하여 값이 잘 나타나도록 하기
        // 정확한 타이밍을 맞추어 기다리기 어려움
        log("main 스레드 sleep()");
        sleep(3000);
        log("main 스레드 깨어남");

        log("task1.result = " + sumTask1.result);
        log("task2.result = " + sumTask2.result);

        int sumAll = sumTask1.result + sumTask2.result;
        log("task1 + task2 = " + sumAll);
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
