package thread.sync.test;

import static util.MyLogger.log;
/*
1. 다음 코드의 실행 결과를 예측
2. localValue 지역 변수에 동시성 문제가 발생하는지 하지 않는지 생각하기
 */
public class SyncTest2Main {
    public static void main(String[] args) throws InterruptedException {
        MyCounter myCounter = new MyCounter();
        Runnable task = new Runnable() {
            @Override
            public void run() {
                myCounter.count();
            }
        };

        Thread thread1 = new Thread(task, "Thread-1");
        Thread thread2 = new Thread(task, "Thread-2");
        thread1.start();
        thread2.start();
    }

    static class MyCounter {

        public void count() {
            int localValue = 0;
            for (int i = 0; i < 1000; i++) {
                localValue = localValue + 1;
            }
            log("결과: " + localValue);
        }
    }
}
/*
1. 결과 :
1000
1000

2. 생각 :
localValue는 메서드 속에서 생성 되는 지역 변수 그래서 각각의 스레드가 가지는 별도의 스택 프레임에 생성이 되는 것!
이 공간은 다른 스레드가 접근 할 수 없는 각자의 스레드 스택 영역에 생긴 것임!
그렇기에 지역 변수는 동기화에 대한 고민을 할 필요 없음!  synchronized 키워드를 사용하지 않아도됨! -> 사용하면 성능만 바보가 된다
공유 자원에 대해서만 동기화에 대한 고민을 해야함!!
 */
