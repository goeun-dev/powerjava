package ch06.prgm;

import java.util.Scanner;

// 1. 3���� ���ڸ� �޾Ƽ� ũ�� ������ �����ϴ� ���α׷�. if-else ���.
public class prgm01 {

	public static void main(String[] args) {
		int num1, num2, num3;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		num1 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		num2 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		num3 = sc.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println("���ĵ� ����: " + num1 + num2 + num3);
		} else if (num1 < num3 && num3 < num2) {
			System.out.println("���ĵ� ����: " + num1 + num3 + num2);
		} else if (num2 < num1 && num1 < num3) {
			System.out.println("���ĵ� ����: " + num2 + num1 + num3);
		} else if (num2 < num3 && num3 < num1) {
			System.out.println("���ĵ� ����: " + num2 + num3 + num1);
		} else if (num3 < num2 && num2 < num1) {
			System.out.println("���ĵ� ����: " + num3 + num2 + num1);
		}else if (num3 < num1 && num1 < num2) {
			System.out.println("���ĵ� ����: " + num3 + num1 + num2);
		} else {
			System.out.println("���ĵ� ����: " + num1 + num2 + num3);
			System.out.println("���� ���ڸ� �Է��Ͽ����ϴ�.");
		}

	}

}
