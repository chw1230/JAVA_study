package util;

import static util.MyLogger.log;

public abstract class ThreadUtils {

    public static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) { //  체크 예외를 잡아서 런타임 예외로 돌려서 던지기
            log("인터럽트 발생, " + e.getMessage());
            throw new RuntimeException(e); // 그러면 sleep 을 사용하는 곳에서 예외를 잡을 필요가 없음!
        }
    }
}
