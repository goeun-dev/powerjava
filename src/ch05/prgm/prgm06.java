package ch05.prgm;

import java.util.Scanner;

// 6. �����뿡 ��� �ִ� ���� �׼��� ����ϴ� ���α׷�.
public class prgm06 {

	public static void main(String[] args) {
		int m500, m100, m50, m10, total;

		Scanner sc = new Scanner(System.in);
		System.out.print("500���� ������ �Է��ϼ���: ");
		m500 = sc.nextInt();
		System.out.print("100���� ������ �Է��ϼ���: ");
		m100 = sc.nextInt();
		System.out.print("50���� ������ �Է��ϼ���: ");
		m50 = sc.nextInt();
		System.out.print("10���� ������ �Է��ϼ���: ");
		m10 = sc.nextInt();

		total = m500 * 500 + m100 * 100 + m50 * 50 + m10 * 10;
		System.out.println("�� �ݾ�: " + total + "��");

	}

}
