package ch06.prgm;

import java.util.Scanner;

// 9. ���� ���α׷�.
public class prgm09 {

	public static void main(String[] args) {
		String key;
		int num1, num2, result;
		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");
		key = sc.next();
		System.out.print("������ �Է��ϼ���: ");
		num1 = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
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
				System.out.println("0���� ���� �� �����ϴ�.");
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
