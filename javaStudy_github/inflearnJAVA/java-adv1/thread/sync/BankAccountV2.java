package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV2 implements BankAccount {

    private int balance; // 잔고

    public BankAccountV2(int initialBalance) {
        this.balance = initialBalance;
    }

    // ---------------------------- 임계영역 ---------------------------
    // synchronized 키워드를 통해서 문제 해결하기! 하나의 스레드만 접근할 수 있도록!!
    @Override
    public synchronized boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());
        // 잔고가 출금액 보다 적으면, 진행 불가


        log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
        if ( balance < amount ) { // 출금액이 잔고보다 큰 경우 인출 실패
            log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
            return false;
        }

        // 잔고가 출금액 보다 많으면, 진행
        log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
        sleep(1000); // 출금에 걸리는 시간으로 가정
        balance = balance - amount;
        log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
    // ---------------------------- 임계영역 ---------------------------
}
