package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int balance = 0;

        while(true) {
            System.out.println("----------------------------------------------");
            System.out.println("1. 임급 | 2. 출금 | 3. 잔액 확인 | 4. 종료");
            System.out.println("----------------------------------------------");
            System.out.print("선택 :");
            int option = input.nextInt();
            if(option == 1){
                System.out.print("입금액을 입력하시오: ");
                int depositMoney = input.nextInt();
                balance = deposit(balance,depositMoney);

            } else if (option == 2) {
                System.out.print("출금액을 입력하시오: ");
                int withdrawMoney = input.nextInt();
                balance = withdraw(balance,withdrawMoney);

            } else if (option == 3) {
                System.out.println("현재 잔액: "+balance+"원");

            }else if (option == 4){
                System.out.println("시스템이 종료됩니다.");
                break;
            }else{
                System.out.println("선택사항에 없는 숫자입니다.");
            }
        }
    }


    public static int deposit(int balance, int money){
        balance += money;
        System.out.println(money+"원을 입금하였습니다. 현재 잔액: "+balance+"원");
        return balance;
    }

    public static int withdraw(int balance, int money){
        if (balance >= money) {
            balance -= money;
            System.out.println(money+"원을 출금하였습니다. 현재 잔액: "+balance+"원");
        }else{
            System.out.println(money+"원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }

}
