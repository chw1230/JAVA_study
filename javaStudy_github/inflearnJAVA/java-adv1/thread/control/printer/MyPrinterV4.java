package thread.control.printer;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;

public class MyPrinterV4 {

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
                printerThread.interrupt(); // 인터럽트 걸기!!
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
            while (!Thread.interrupted()) {
                if (jobQueue.isEmpty()) {
                    Thread.yield(); // 이 코드 추가를 통해서 -> 현재 실행 중인 스레드가 다른 준비된 스레드에게 실행 기회를 양보하는 힌트를 운영체제에게 주는 것!!!!
                    continue;
                }
                // 위의 if 문을 통해서 큐에 값이 들어올 때까지 계속 확인 -> while문과 이 if문과정에서 cpu가 엄청나게 많이 실행됨!!
                // 그래서 Thread.yield() 를 추가해주기!!

                /*
                큐가 비어 있으니까 -> 나(프린터 스레드)는 할일 이 없는 거고
                그러니까 cpu를 쓸 사람은 써
                하면서 yield로 양보하겠다
                -> 그리면 while 문으로 멍청하게 돌 일이 없음 할 일 없네? -> 딴 놈에 넘겨~
                 */

                try {
                    String job = jobQueue.poll(); // 큐에서 작업을 하나 빼기
                    log("출력 시작: " + job + ", 대기 문서: " + jobQueue);
                    Thread.sleep(3000);
                    log("출력 완료: " + job);
                } catch (InterruptedException e) {
                    // 인터럽트 걸리면 로그찍고 while 문에서 나가도록!
                    log("인터럽트 발생!");
                    break;
                }
            }
            log("프린트 종료");
        }

        public void addJob(String input) {
            jobQueue.offer(input); // 큐에다가 추가해주는 메서드
        }
    }
    // 근데 플래그 변수가 꼭 있어야 할까? -> 응 없애보자~ >,< => 사라지게함! Thread.interrupted() 사용함!
}
