package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        // 현재 실행하는 스레드 객체를 받아서 이름 출력
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": start() 호출 후"); // run() 메서드가 실행되는 것을 기다리는 것이 아니라 바로 다음 줄을 바로 호출

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
    /* 출력
    main: main() start
    main: start() 호출 전
    main run()
    main: start() 호출 후
    main: main() end
     */

}
