//2110883 김혜수
//2022.09.29
//Lab04 은행계좌 잔액, 입출금, 이체 
package Lab04;
import java.util.Scanner;

class BankAccount{
	private int balance;
	
	public BankAccount(int a) {
		balance = a;
		if (balance <= 0) {
			System.out.println("잔액처리 할 수 없음 ");
		}
	}
	

	public void transfer(int amount, BankAccount otherAccount) {
		
		if (balance < amount) {
			System.out.println("잔액 부족으로 출금 할 수 없음 ");
		}
		else {
			otherAccount.balance += amount;
			this.balance -= amount;
		}
	}
	
	public void deposit(int amount) {
		if (amount > 0) {
			this.balance += amount;
		}
		else
			System.out.println("입금 불가 ");

	}
	
	public void withdraw(int amount) {
		if (amount >0 & this.balance >= amount) {
			this.balance -= amount;
		}
		else
			System.out.println("출금 불가 ");

	
	}
	
	//tostring
	public String toString() {
		return ("Bankaccount[balance="+balance+"]");
	}
	
	//getset 사용 
	public int balance() { return balance;}
	public void setbalance(int balance) { this.balance = balance;}
	
	
}

public class BankAccountTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("계좌 1 잔액 입력:");
		int a1 = scan.nextInt();
		BankAccount myAccount1 = new BankAccount(a1);
		
		System.out.print("계좌 2 잔액 입력:");
		int a2 = scan.nextInt();
		BankAccount myAccount2 = new BankAccount(a2);
		
		System.out.println("myAccount1:" +myAccount1);
		System.out.println("myAccount2:" +myAccount2+"\n");


		
		System.out.print("계좌 1 --> 계좌2 이체 금액 입력:");
		int t = scan.nextInt();
		myAccount1.transfer(t, myAccount2);
		System.out.println("transfer호출 후 ");
		System.out.println("myAccount1:"+ myAccount1);
		System.out.println("myAccount2:"+ myAccount2);

	}

}
