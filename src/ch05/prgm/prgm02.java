package ch05.prgm;

import java.util.Scanner;

// 2. �� ���� ������ �Է¹޾Ƽ�, ū ���� ���� ���� ���� ��� �������� ����ϴ� ���α׷�.
public class prgm02 {

	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		num1 = sc.nextInt();
		System.out.print("������ �Է��Ͻÿ�: ");
		num2 = sc.nextInt();

		System.out.println(num2 + "�� " + num1 + "�� ���� ���� " + num2 / num1 + "�̰� ��������" + num2 % num1 + "�Դϴ�.");

	}

}
