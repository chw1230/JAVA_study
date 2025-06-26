package thread.start;

public class HelloRunnableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunnable runnable = new HelloRunnable(); // 스레드 객체 생성
        Thread thread = new Thread(runnable); // 작업을 받기 -> 작업을 분리한 것을 볼 수 있음!
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");

    }
}
