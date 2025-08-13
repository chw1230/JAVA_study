package thread.control.join.test;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;
/*
예상 시간 맞추기 문제 -> 9초 걸림
=> 이유 (시작 3초 걸림 -> 대기)*3 => 9초
 */
public class JoinTest1Main {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(new MyTask(), "t1");
        Thread t2 = new Thread(new MyTask(), "t2");
        Thread t3 = new Thread(new MyTask(), "t3");

        t1.start(); // 3초
        t1.join(); // 대기

        t2.start(); // 3초
        t2.join(); // 대기

        t3.start(); // 3초
        t3.join(); // 대기

        System.out.println("모든 스레드 실행 완료");
    }
    static class MyTask implements Runnable {
        @Override
        public void run() {
            for (int i = 1; i <= 3; i++) {
                log(i);
                sleep(1000);
            }
        }
    }
}
