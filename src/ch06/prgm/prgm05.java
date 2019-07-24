package ch06.prgm;

import java.util.Scanner;

// 5. 사용자로 부터 x값을 입력 받아 함수값을 계산하는 프로그램. (x는 실수)
public class prgm05 {

	public static void main(String[] args) {
		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print("x값을 입력하세요: ");
		x = sc.nextDouble();

		if (x >= 0) {
			System.out.println(x * x * x - 9 * x + 2);
		} else {
			System.out.println(7 * x + 2);
		}
	}

}
