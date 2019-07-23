package ch05.prgm;

import java.util.Scanner;

// 6. 저금통에 들어 있는 돈의 액수를 계산하는 프로그램.
public class prgm06 {

	public static void main(String[] args) {
		int m500, m100, m50, m10, total;

		Scanner sc = new Scanner(System.in);
		System.out.print("500원의 개수를 입력하세요: ");
		m500 = sc.nextInt();
		System.out.print("100원의 개수를 입력하세요: ");
		m100 = sc.nextInt();
		System.out.print("50원의 개수를 입력하세요: ");
		m50 = sc.nextInt();
		System.out.print("10원의 개수를 입력하세요: ");
		m10 = sc.nextInt();

		total = m500 * 500 + m100 * 100 + m50 * 50 + m10 * 10;
		System.out.println("총 금액: " + total + "원");

	}

}
