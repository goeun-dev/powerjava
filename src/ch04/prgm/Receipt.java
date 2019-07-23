package ch04.prgm;

import java.util.Scanner;

// 2. 구입한 상품의 가격과 손님한테 받은 금액을 입력하면 부가세와 잔돈을 출력하는 프로그램.
public class Receipt {

	public static void main(String[] args) {
		// 받은 돈
		int rprice;
		// 상품의 총액
		int total;
		// 부가세
		int vat;
		// 잔돈
		int changes;
		
		Scanner input = new Scanner(System.in);
		System.out.print("받은 돈: ");
		rprice = input.nextInt();
		System.out.print("상품의 총액: ");
		total = input.nextInt();
		
		vat = total/10;
		changes = rprice-total;
		
		System.out.println("부가세: " + vat);
		System.out.println("잔돈: " + changes);
	}

}
