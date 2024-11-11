package ch06.check.exam19;

public class Account {
	private int balance;
	public static final int MIN_BALANCE = 0;
	public static final int MAX_BALANCE = 1000000;
	
	public void setBalance(int money){
		if(money<Account.MIN_BALANCE || 1000000<Account.MAX_BALANCE) {
			return;
		}
		this.balance = money;
	}
	
	public int getBalance(){
		return balance;
	}
}
