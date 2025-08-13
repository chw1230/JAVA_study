package thread.control;

import thread.start.HelloThread;

import static util.MyLogger.log;

public class ThreadInfoMain {
    public static void main(String[] args) {
        // main 스레드 가져오기 - main 스레드가 실행함
        Thread mainThread = Thread.currentThread();
        log("mainThread.threadId() = " + mainThread.threadId()); // 스레드 Id(다른 것과 중복 될 수 없음)
        log("mainThread.getName() = " + mainThread.getName()); // 스레드 이름(다른 것과 중복 될 수 있음)
        log("mainThread.getPriority() = " + mainThread.getPriority()); // 우선순위( 스레드 스케줄러가 실행하는데 도움을 줌 )
        log("mainThread.getThreadGroup() = " + mainThread.getThreadGroup()); // 스레드 그룹
        log("mainThread.getState() = " + mainThread.getState()); // 스레드 상태

        // myThread 스레드 가져오기 - my스레드가 실행함
        Thread myThread = new Thread(new HelloThread(), "myThread"); //
        log("myThread.threadId() = " + myThread.threadId()); // 스레드 Id(다른 것과 중복 될 수 없음-랜덤 생성)
        log("myThread.getName() = " + myThread.getName()); // 스레드 이름(다른 것과 중복 될 수 있음)
        log("myThread.getPriority() = " + myThread.getPriority()); // 우선순위( 스레드 스케줄러가 실행하는데 도움을 줌 )
        log("myThread.getThreadGroup() = " + myThread.getThreadGroup()); // 스레드 그룹
        log("myThread.getState() = " + myThread.getState()); // 스레드 상태
    }
}
