package ch05.lab;

import java.util.Scanner;

// [��������1] ����ڿ��� ������ �Է¹޾� ���������� �˻��ϴ� ���α׷�.
public class LeapYear {
	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		year = sc.nextInt();
		
		boolean isLeapYear = (year%4 == 0 && year%100 != 0 || year%400 == 0);
		
		System.out.println(year+"���� ���� ����: "+isLeapYear);
		
		
		
	}
}
