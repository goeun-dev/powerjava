package ch05.prgm;

import java.util.Scanner;

// 9. ����ڷκ��� ��ü�� �־��� ���� ��ü�� ������ �Է¹޾Ƽ� �з��� ���⸦ ����ϴ� ���α׷�.
public class prgm09 {

	public static void main(String[] args) {
		double p, s;

		Scanner sc = new Scanner(System.in);
		System.out.print("��: ");
		p = sc.nextDouble();
		System.out.print("����: ");
		s = sc.nextDouble();

		System.out.println("�з��� ����: " + p / s);

	}

}
