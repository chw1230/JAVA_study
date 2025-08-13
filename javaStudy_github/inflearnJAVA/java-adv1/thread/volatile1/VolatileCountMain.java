package thread.volatile1;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class VolatileCountMain {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread t = new Thread(task, "work");
        t.start();

        sleep(1000);
        task.flag = false;
        log("flag = " + task.flag + ", count = " + task.count + " in main");
    }

    static class MyTask implements Runnable {
//        boolean flag = true;
//        long count;
        // 이렇게 적용하면 main 스레드가 값을 변경한 시점과 work 스레드가 변경된 것을 확인하는 시점이 달라서 결과가 다르게 나옴!!

        volatile boolean flag = true;
        volatile long count;
        // 이렇게 적용하면 main 스레드가 flag를 변경하는 시점에 work 스레드도 flag의 변경 값을 정확하게 확인할 수 있음
        // 그리고 성능이 안 좋아지기 때문에 count의 값도 작은 것을 볼 수 있음

        @Override
        public void run() {
            while (flag) {
                count++;
                // 1억번에 한번씩 출력
                if (count % 100_000_000 == 0) {
                    log("flag = " + flag + ", count = " + count + " in while()");
                }
            }
            log("flag = " + flag + ", count = " + count + " 종료");
        }
    }
}

