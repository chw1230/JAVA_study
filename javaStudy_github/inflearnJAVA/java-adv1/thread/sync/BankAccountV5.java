package thread.sync;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV5 implements BankAccount {

    private int balance; // 잔고

    private final Lock lock = new ReentrantLock();

    public BankAccountV5(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());

        if (!lock.tryLock()) {
            // tryLock -> true 이면 락을 획득하고 true를 반환 / false이면 다른 스레드가 이미 락을 획득한 것!!
            log("[진입 실패] 이미 처리중인 작업이 있습니다.");
            return false;
        }

        try {
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
            if (balance < amount) { // 출금액이 잔고보다 큰 경우 인출 실패
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }
            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000); // 출금에 걸리는 시간으로 가정
            balance = balance - amount;
            log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);
        } finally {
            lock.unlock(); // ReentrantLock 이용하여 lock 해제, 중간에 return이 있기 때문에 finally로 잡기, lock 했으면 무조건 unlock 하기!
        }
        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        lock.lock(); // ReentrantLock 이용하여 lock 걸기
        try {
            return balance;
        } finally {
            lock.unlock(); // ReentrantLock 이용하여 lock 해제
        }
    }
}

/*  ReentrantLock 사용
 void lock(); -> 락 획득, 다른 스레드가 획득 했다면 락이 풀릴 때까지 현재 스레드는 WAITING, 인터럽트에 반응하지 않음
 void lockInterruptibly() throws InterruptedException; -> 락 획득 시도, 다른 스레드가 인터럽트할 수 있음 / 다른 스레드가 이미 락을 획득했다면, 현재 스레드는 락 획득할 때까지 대기, 대기 중 인터럽트 발생? -> InterruptedException => 락 획득 포기
 boolean tryLock(); -> 락 획득 시도, 성공 여부 반환
 boolean tryLock(long time, TimeUnit unit) throws InterruptedException; -> 특정 시간 동안 락 획득 시도
 void unlock(); -> 락 해제, 락을 획득한 스레드가 해제를 해야함
 Condition newCondition(); -> Condition 객체를 생성하여 반환, 락과 결합되어 사용, 스레드가 특정 조건을 기다리거나 신호를 받을 수 있도록 함!
 */