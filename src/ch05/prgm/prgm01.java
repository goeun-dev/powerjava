package ch05.prgm;

import java.util.Scanner;

// 1. ����ڿ��� �̸��� ���̸� ����� ȭ�鿡 �̸��� ���̸� �ٽ� ����ϴ� ���α׷�.
public class prgm01 {

	public static void main(String[] args) {
		String name;
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.print("�̸�: ");
		name = sc.next();
		System.out.print("����: ");
		age = sc.nextInt();

		System.out.println("�̸��� " + name + "�̰� ���̴� " + age + "���Դϴ�.");

	}

}
