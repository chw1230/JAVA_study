package thread.sync.test;
/*
다음 코드의 결과는 20000이 되어야 한다.
이 코드의 문제점을 찾아서 해결해라.
이 코드에서 다른 부분은 변경하면 안되고, Counter 클래스 내부만 수정해야 한다
 */
public class SyncTest1BadMain {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Runnable task = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    counter.increment();
                }
            }
        };
        Thread thread1 = new Thread(task);
        Thread thread2 = new Thread(task);

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("결과: " + counter.getCount());
    }

    static class Counter {
        private int count = 0;

        public synchronized void increment() {
            count = count + 1;
        }

        public synchronized int getCount() {
            return count;
        }
    }
}

/*
increment() 호출 하면
count = count + 1; 은 3가지로 나뉘어져 있음
1. count 값을 읽고
2. 계산하고
3. 저장하고

이 과정에서 스레드가 동시에 0을 읽어버리는 일 이 발생! 2번 을 실행한 것인데
 실제로는 동시에 0을 읽고 1을 더하소 1을 저장하면서 1로 저장하는 일이 발생이 되는 것!
 cnt = cnt + 1 이 임계 영역인 것! 그래서 synchronized 붙여주기!

 */

