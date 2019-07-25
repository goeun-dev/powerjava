package ch07.lab;

// 은행계좌
class BankAccount {
	int balance; // 잔액을 표시하는 변수

	// 저금
	void deposit(int amount) {
		balance += amount;
	}

	//	 인출 (잔고가 음수일 때 예금 인출 불가)
	void withdraw(int amount) {
		if (balance-amount < 0) {
			System.out.println("잔고가 부족합니다.");
		} else {
			balance -= amount;
		}
	}

	// 잔고 반환
	int getBalance() {
		return balance;
	}

	// 현재 잔액에 대하여 연 7.5%의 이자를 계산하여 추가하는 메소드
	void addInterest() {
		balance += balance * 0.075;
	}
}

public class BankAccountTest {

	public static void main(String[] args) {
		BankAccount b = new BankAccount();

		b.deposit(100); // b의 잔고를 100으로 한다.
		b.withdraw(160); // b에서 60을 인출한다.
		//b.addInterest();
		System.out.println("현재 잔고: "+b.getBalance()); // b의 현재 잔고를 얻어서 화면에 출력한다.
	}

}


/*
 * 4) BankAccount 클래스 앞에 public을 추가하고 프로그램을 컴파일해보자. 어떤 오류가 발생하는가? 
 * public을 붙이는 것과 붙이지 않는 것의 차이는 무엇인가?
 * -> 아래와 같은 오류 내용이 발생한다.
 * Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
 * The public type BankAccount must be defined in its own file
 * 
 * at ch07.lab.BankAccount.<init>(BankAccountTest.java:4)
 * at ch07.lab.BankAccountTest.main(BankAccountTest.java:35)
 * 
 * 자바에서는 파일명으로 정의된 클래스에만 public을 선언할 수 있다.
 * public 접근제어자가 붙은 변수, 메소드는 어떤 클래스에서라도 접근이 가능하다는 것을 의미한다.
 * */
