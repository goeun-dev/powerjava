package ch05.prgm;

import java.util.Scanner;

// 5. ������ ü���� ���ϴ� ���α׷�.
public class prgm05 {

	public static void main(String[] args) {
		// 100������ ������ �ޱ� ���� byte�� ���
		byte length, width, height;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ ����: ");
		length = sc.nextByte();
		System.out.print("������ �ʺ�: ");
		width = sc.nextByte();
		System.out.print("������ ����: ");
		height = sc.nextByte();

		System.out.println("������ ü���� " + length * width * height);
	}

}
