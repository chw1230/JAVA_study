package method.ex;

public class MethodEx3Ref {
    public static void main(String[] args) {
        int balance = 10000;
        int depositAmount = 1000;
        int withdrawAmount = 2000;

        balance = deposit( balance , depositAmount );
        balance = withdraw( balance , withdrawAmount );

        System.out.println("최종잔액 : " + balance);
    }

    public static int deposit(int balance ,int money) {
        balance += money;
        System.out.println(money+"원을 입금하였습니다. 현재 잔액: "+balance+"원");
        return balance;
    }

    public static int withdraw(int balance ,int money) {
        if(balance >= money){
            balance -= money;
            System.out.println(money+"원을 인출하였습니다. 현재 잔액: "+balance+"원");
        }else {
            System.out.println("잔고 부족으로 인출에 실패하였습니다.");
        }
        return balance;
    }



}
