package thread.start;

import static util.MyLogger.log;

public class InnerRunnableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        // 익명 클래스  이용! -> 특정 메서드 안에서만 간단하게 사용하고 싶은 경우에 사용! + 람다 사용!(람다를 배우면 이해가 될 것!)
        Thread thread = new Thread(() -> log("run()"));
        thread.start();

        log("main() end");
    }
}
