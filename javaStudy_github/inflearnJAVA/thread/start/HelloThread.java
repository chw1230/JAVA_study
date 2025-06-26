package thread.start;

public class HelloThread extends Thread {
    // Thread 클래스 상속, 스레드가 실행할 코드를 run() 메서드에 재정의
    @Override
    public void run() {
        // main과는 다른 스레드가 run메서드를 실행
        System.out.println(Thread.currentThread().getName() + " run()");
    }
}
