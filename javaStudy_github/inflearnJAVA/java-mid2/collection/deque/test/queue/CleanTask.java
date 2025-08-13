package collection.deque.test.queue;

public class CleanTask implements Task{
    //문제2 - 작업 예약
    @Override
    public void execute() {
        System.out.println("사용하지 않는 자원 정리...");
    }
}
