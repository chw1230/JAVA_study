package collection.deque.test.queue;

public class BackupTask  implements Task {
    //문제2 - 작업 예약
    @Override
    public void execute() {
        System.out.println("자료 백업...");
    }
}
