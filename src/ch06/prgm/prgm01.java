package ch06.prgm;

import java.util.Scanner;

// 1. 3개의 숫자를 받아서 크기 순으로 정렬하는 프로그램. if-else 사용.
public class prgm01 {

	public static void main(String[] args) {
		int num1, num2, num3;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		num2 = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		num3 = sc.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("정렬된 숫자: " + num1 + num2 + num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println("정렬된 숫자: " + num1 + num3 + num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println("정렬된 숫자: " + num2 + num1 + num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println("정렬된 숫자: " + num2 + num3 + num1);
		} else if (num3 < num2 && num2 < num1) {
			System.out.println("정렬된 숫자: " + num3 + num2 + num1);
		}else if (num3 < num1 && num1 < num2) {
			System.out.println("정렬된 숫자: " + num3 + num1 + num2);
		} else {
			System.out.println("정렬된 숫자: " + num1 + num2 + num3);
			System.out.println("같은 숫자를 입력하였습니다.");
		}

	}

}
