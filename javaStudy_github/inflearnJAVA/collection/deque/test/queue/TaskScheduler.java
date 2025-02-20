package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {
    //문제2 - 작업 예약
    Deque<Task> deque = new ArrayDeque<>();

    //낮에 작업을 저장
    public void addTask(Task task) {
        deque.offer(task);
    }


    public int getRemainingTasks() {
        return deque.size();
    }

    public void processNextTask() {
        deque.poll().execute();
    }
}
