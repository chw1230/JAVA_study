package thread.start;

public class HelloThreadMain {

    public static void main(String[] args) {
        // 현재 실행하는 스레드 객체를 받아서 이름 출력
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.start(); // .run() 호출 하면 안됨! + main 스레드는 start() 메서드를 통해서 스레드에게 실행을 지시!!하고
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후"); // run() 메서드가 실행되는 것을 기다리는 것이 아니라 바로 다음 줄을 바로 호출

        System.out.println(Thread.currentThread().getName() + ": main() end");
        /* 출력 - CPU 스케줄링에 따라서 순서가 다른 결과가 출력 될 수 있음!
        main: main() start
        main: start() 호출 전
        main: start() 호출 후
        main: main() end
        Thread-0 run() => 출력 되는 위치(순서)가 달라 질 수 있음!
         */


        // 스레드는 순서와 실행 기간을 모두 보장하지 않는다, 멀티스레드
    }
}
