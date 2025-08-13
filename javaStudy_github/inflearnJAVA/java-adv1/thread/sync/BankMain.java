package thread.sync;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class BankMain {

    public static void main(String[] args) throws InterruptedException {
//        BankAccount account = new BankAccountV1(1000);
//        BankAccount account = new BankAccountV2(1000); // 동기화 적용한 것!
        BankAccount account = new BankAccountV3(1000); // 동기화 적용 ( 특정 코드 블럭에 적용 )
        // 계좌에 1000원 있는 데 동시에 출력!
        Thread t1 = new Thread(new WithdrawTask(account, 800), "t1");
        Thread t2 = new Thread(new WithdrawTask(account, 800), "t2");

        t1.start();
        t2.start();

        sleep(500); // 검증 완료까지 잠시 대기
        log("t1 state: " + t1.getState());
        log("t2 state: " + t2.getState());

        t1.join();
        t2.join();

        log("최종 잔액: " + account.getBalance());
    }
}
// 동시성 문제 발생
/*
t1, t2 스레드는 거의 동시에 실행됨 그래서 계좌의 잔액이 -600원(t1이 먼저 t2가 나중에 실행되는 경우_case1)
또는 200원이 되는 일(t1과 t2 스레드가 동시에 실행되는 경우_case2)이 생김!

- case 1 : -600원 되는 경우 t1이 검증 로직(if문)을 통과해서 sleep 하고 있는 동안 t2도 검증 통과함 왜?
-> 아직 t1에서 잔고를 바꾸는 로직을 실행하지 않았기 때문에 t2도 검증을 마치고 sleep에 도착
 그런뒤에 t1이 잔고에서 돈을 인출하고, 그 뒤에 t2가 잔고에서 인출하면서 -600원이 되는 것

- case 2 : 200원이 되는 경우 t1과 t2가 동시에 검증을 시작 둘다 동시에 통과하고 둘다 동시에 sleep이 됨!
그런뒤 동시에 잔고 1000을 가져오고 인출하고 남은 잔고를 동시에 저장!! 그래서 200원이 저장됨!

case 2가 더 심각한 문제임! -> case1은 한번 더 빠짐을 알 수 있지만 case2는 돈이 더 빠짐을 알아 챌 수 도 없음!!

지금 문제가 여러 스레드가 동시에 접근하면서 문제가 생기는 영역(임계영역) 때문임!
이러한 임계 영역을 하나의 스레드만 접근할 수 있도록 하는 방법은 synchronized 키워드를 사용해서 간단하게 임계 영역을 보호하는 것!

synchronized 키워드가 붙으면 모든 객체 내부에 가지고 있는 자신만의 lock을 가져오고 키워드가 붙은 곳을 나갈 때 반납!
lock이 없으면 키워드가 붙은 곳에 갈 수 없음!


volatile를 사용하지 않아도 synchronized 안에서 접근하는 변수의 메모리 가시성 문제는 자동으로 해결됨!!
*/
