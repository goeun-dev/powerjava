package ch06.prgm;

import java.util.Scanner;

// 4. 3���� ������ �о� ���� �Ŀ� if-else ���� ����Ͽ� ���� ���� ���� �����ϴ� ���α׷�.
public class prgm04 {

	public static void main(String[] args) {
		int a, b, c;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		a = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		b = sc.nextInt();
		System.out.print("������ �Է��ϼ���: ");
		c = sc.nextInt();

		if (a < b && a < c) {
			System.out.println("���� ���� ������ " + a + "�Դϴ�.");
		} else if (b < a && b < c) {
			System.out.println("���� ���� ������ " + b + "�Դϴ�.");
		} else if (c < b && c < a) {
			System.out.println("���� ���� ������ " + c + "�Դϴ�.");
		} else {
			System.out.println("��� ���� ������ �Է��߽��ϴ�.");
		}

	}

}
