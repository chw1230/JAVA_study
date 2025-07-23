package thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class MyPrinterV1 {

    // 사용자의 입력을 받는 main 스레드
    public static void main(String[] args) {
        Printer printer = new Printer();
        Thread printerThread = new Thread(printer, "printer");
        printerThread.start(); // printer 스레드 실행하기

        Scanner userInput = new Scanner(System.in);
        while (true) {
            log("프린터할 문서를 입력하세요. 종료 (q) : ");
            String input = userInput.nextLine(); // main 스레드에서 입력을 받아서
            if (input.equals("q")) { // q 입력하면 스레드 종료
                printer.work = false;
                break;
            }
            printer.addJob(input); // printer 인스턴스의 jobQueue에 추가하기
        }
    }

    // 사용자의 입력을 출력하는 Printer 스레드
    static class Printer implements Runnable {
        volatile boolean work = true; // 여러 스레드가 동시에 접근 할 수 있도록 하는 변수에 붙여주기
        Queue<String> jobQueue = new ConcurrentLinkedQueue<>(); // 동시성을 위한 컬렉션 설정하기

        @Override
        public void run() {
            while (work) {
                if (jobQueue.isEmpty()) { // 비어 있으면
                    continue; // 아래 코드를 실행하지 않고, while 반복의 처음으로 이동
                }
                // 위의 if 문을 통해서 큐에 값이 들어올 때까지 계속 확인

                String job = jobQueue.poll(); // 큐에서 작업을 하나 빼기
                log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
                sleep(3000);
                log("출력 완료: " + job);
            }
            log("프린트 종료");
        }

        public void addJob(String input) {
            jobQueue.offer(input); // 큐에다가 추가해주는 메서드
        }
    }

    // 이 코드의 문제점 : q를 입력했을 때 바로 반응하지 않음!
    // 최악의 경우에는 3초후에 종료가됨!
    // -> 인터럽트로 해결하기!

}
