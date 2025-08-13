package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankAccountV3 implements BankAccount {

    private int balance; // 잔고

    public BankAccountV3(int initialBalance) {
        this.balance = initialBalance;
    }

    @Override
    public boolean withdraw(int amount) {
        log("거래 시작: " + getClass().getSimpleName());
        // 잔고가 출금액 보다 적으면, 진행 불가

        synchronized (this) { //  꼭 필요한 코드만 안전한 임계 영역으로 만들기
            // this에 들어 가는 것은 락을 획득할 인스턴스의 참조를 의미
            // 임계 영역 시작
            log("[검증 시작] 출금액: " + amount + ", 잔액: " + balance);
            if (balance < amount) { // 출금액이 잔고보다 큰 경우 인출 실패
                log("[검증 실패] 출금액: " + amount + ", 잔액: " + balance);
                return false;
            }
            // 잔고가 출금액 보다 많으면, 진행
            log("[검증 완료] 출금액: " + amount + ", 잔액: " + balance);
            sleep(1000); // 출금에 걸리는 시간으로 가정
            balance = balance - amount;
            log("[출금 완료] 출금액: " + amount + ", 잔액: " + balance);
            // 임계 영역 종료
        }

        log("거래 종료");
        return true;
    }

    @Override
    public synchronized int getBalance() {
        return balance;
    }
}
/*
synchronized의 장점이자 단점
한 번에 하나의 스레드만 실행할 수 있다는 점!!
여러 스레드가 동시에 실행하지 못하기 때문에, 전체로 보면 성능이 떨어질 수 있음
따라서 synchronized를 통해서 여러 스레드를 동시에 실행할 수 없는 구간은 꼭! 필요한 곳으로 한정해서 설정해야한다.
지금 까지는 메서드에 키워드를 붙여서 사용하였지만 이제는 정말 필요한 곳에만 사용할 수 있도록 특정 코드 블럭에 최적화 해서 적용!!

하나의 스레드만 실행할 수 있는 안전한 임계 영역은 가능한 최소한의 범위에 적용해야한다!!
그래야 동시에 여러 스레드가 실행할 수 있는 부분을 늘려서, 전체적인 처리 성능 향상 시킬 수 있음!!

synchronize를 통해서 해결할 수 있는 것!
1. 경합 조건 해결 : 경합조건-두 개 이상의 스레드가 경쟁적으로 동일한 자원을 수정할 때 발생하는 문제
2. 데이터 일관성 해결 : 여러 스레드가 동시에 일고 쓰는 데이터의 일관성 유지
 */