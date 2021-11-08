package oopAssign1;

// 4���� ���� Exercise

class account {
	
	private String account;		
	private int balance;
	private double interestRate; 

	public account() { 
	}

	public account ( String account, int balance, double interestRate) {
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public void setAccount ( String account ) { 
		this.account = account;
	}
	public String getAccount () {
		return account;
	}
	
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getBalance () {
		return balance;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public double getInterestRate() {
		return interestRate;
	}
	
	public double calculateInterest() {
		return balance * interestRate;
	}

	public void deposit (int money) {
		balance = money + balance;
	}

	public void withdraw (int money) {
		balance = balance - money;
	}
}



public class practice {
		
	public static void main (String[] args) {
		account account = new account("411-0290-1203", 500000, 7.3/100); 
		
		System.out.println("��������: " + account.getAccount() + " �����ܾ�: " + account.getBalance());

		account.deposit(20000); 
		account.calculateInterest(); 
		
		System.out.println("��������: " + account.getAccount() + " �����ܾ�: " + account.getBalance());
		System.out.println("����: " + account.calculateInterest()); 
	}
}
