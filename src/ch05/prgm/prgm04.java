package ch05.prgm;

import java.util.Scanner;

// 4. ������� ���Ǹ� ���ϴ� ���α׷�.
public class prgm04 {

	public static void main(String[] args) {
		double radius, height;
		double PI = 3.141592;

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �ظ��� �������� �Է��Ͻÿ�: ");
		radius = sc.nextDouble();
		System.out.print("������� ���̸� �Է��Ͻÿ�: ");
		height = sc.nextDouble();

		System.out.println("������� ���Ǵ� " + radius * radius * PI * height + "�Դϴ�.");
	}

}
