package ch05.prgm;

import java.util.Scanner;

// 3. cm�� ǥ���� Ű�� �Է��Ͽ� ��Ʈ�� ��ġ�� ��ȯ�ϴ� ���α׷�.
public class prgm03 {
	public static void main(String[] args) {
		double cm, inch;
		int feet;

		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��Ͻÿ�: ");
		cm = sc.nextDouble();
		inch = cm / 2.54;
		feet = (int) inch / 12;
		inch = inch - (12 * feet);

		System.out.println((int) cm + "cm�� " + feet + "��Ʈ " + inch + "��ġ�Դϴ�.");
	}
}
