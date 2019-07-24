package ch06.prgm;

import java.util.Scanner;

// 9. 계산기 프로그램.
public class prgm09 {

	public static void main(String[] args) {
		String key;
		int num1, num2, result;
		Scanner sc = new Scanner(System.in);

		System.out.print("문자를 입력하세요: ");
		key = sc.next();
		System.out.print("정수를 입력하세요: ");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하세요: ");
		num2 = sc.nextInt();

		switch (key) {
		case "+":
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
		case "-":
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
		case "*":
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		case "/":
			if (num2 == 0) {
				System.out.println("0으로 나눌 수 없습니다.");
			} else {
				result = num1 / num2;
				System.out.println(num1 + "/" + num2 + "=" + result);
			}
			break;
		default:
			break;
		}

	}

}
