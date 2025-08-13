package thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV3 {
    public static void main(String[] args) throws InterruptedException {
        log("Start");
        SumTask sumTask1 = new SumTask(1, 50);
        SumTask sumTask2 = new SumTask(51, 100);
        Thread thread1 = new Thread(sumTask1, "Thread-1");
        Thread thread2 = new Thread(sumTask2, "Thread-2");

        thread1.start();
        thread2.start();

        // 스레드가 종료될 때 까지 대기하기
        log("join() - main 스레드 thread1,thread2 종료까지 대기");
        thread1.join(); // thread1번이 종료될 때까지 main 쓰레드에서 대기하는 것!
        thread2.join(); // thread2번이 종료될 때까지 main 쓰레드에서 대기하는 것!
        log("main 스레드 대기 완료");
        /*
        thread-1이 종료되는 시점에 thread-2도 거의 같이 종료되기 때문에 thread2.join()은 대기하지
        않고 바로 빠져나온다!
         */

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
