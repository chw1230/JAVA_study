package thread.start;

public class DemonThreadMain {
    public static void main(String[] args) {

        System.out.println(Thread.currentThread().getName() + ": main() start");
        DaemonThread daemonThread = new DaemonThread();
        daemonThread.setDaemon(true); // 데몬 스레드 여부
        // true 이라면 데몬 스레드로 실행되기 때문에 main 스레드가 다 끝나면 바로 종료됨 그래서 10초 기다리고 run() end가 출력되지 않음
        /*
        main: main() start
        main: main() end
        Thread-0: run()
         */
        // false 이라면 데몬 스레드로 싱행되지 않고 그냥 일반 사용자 스레드가 실행됨!! 그래서 10초 기다리고 run() end 코드가 실행이 됨!!
        /*
        main: main() start
        main: main() end
        Thread-0: run()
        Thread-0: run() end
         */
        daemonThread.start();
        System.out.println(Thread.currentThread().getName() + ": main() end");
    }

    static class DaemonThread extends Thread {

        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + ": run()");

            try {
                Thread.sleep(10000); // 10초간 실행
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + ": run() end");

        }
    }
}
