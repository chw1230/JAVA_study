package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV1 {
    // 중첩 클래스로 구현하기
    public static void main(String[] args) {
        log("main() start");

        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.start();

        log("main() end");
    }

    // 해당 클래스를 여기에서만 쓸 것 같으면 중첩 클래스로 만들기~!
    static class MyRunnable implements Runnable {
        @Override
        public void run() {
            log("run()");
        }
    }
}
