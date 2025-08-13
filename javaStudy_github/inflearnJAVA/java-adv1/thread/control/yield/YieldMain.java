package thread.control.yield;

import static util.ThreadUtils.sleep;

public class YieldMain {

    static final int THREAD_COUNT = 1000;

    public static void main(String[] args) {
        for (int i = 0; i < THREAD_COUNT; i++) { // 1000개의 스레드를 만들어서 실행!
            Thread thread = new Thread(new MyRunnable());
            thread.start();
        }

    }

    static class MyRunnable implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(Thread.currentThread().getName() + "-" + i);
                // 1. empty -> 아무런 코드 없이 for문 속에서 -> System.out.println(Thread.currentThread().getName() + "-" + i); 이 코드만 입력된 상태
                // 중간중간 바뀌기는 해도 한 스레드가 많은 양을 실행하는 것을 볼 수 있음!

                // sleep(1); // 2. sleep 출력하고 잠시 스레드가 잠시 쉴수 있도록 하는 sleep(1)을 1. empty에 추가!!
                // 한 스레드가 쭉 몇개를 실행하는 것이 아니라 스레드가 계속 바뀌며 출려되는 것을 볼 수 있음!

                Thread.yield(); // 3. yield , sleep 보다는 같은 스레드가 더 자주 실행함! / 뭔가 empty와 sleep의 중간 느낌!
            }
        }
    }

    // 결과적으로 1000개의 스레드가 0부터 9까지 출력하게 됨!
}
