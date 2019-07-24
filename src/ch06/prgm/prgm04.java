package ch06.prgm;

import java.util.Scanner;

// 4. 3개의 정수를 읽어 들인 후에 if-else 문을 사용하여 가장 작은 값을 결정하는 프로그램.
public class prgm04 {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하세요: ");
		a = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		b = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("가장 작은 정수는 " + a + "입니다.");
		} else if (b < a && b < c) {
			System.out.println("가장 작은 정수는 " + b + "입니다.");
		} else if (c < b && c < a) {
			System.out.println("가장 작은 정수는 " + c + "입니다.");
		} else {
			System.out.println("모두 같은 정수를 입력했습니다.");
		}

	}

}
