package ch04.prgm;
// 1. ������ ų�ι��ͷ� ��ȯ�ϴ� ���α׷�

import java.util.Scanner;

public class ConvertKM {
	public static void main(String[] args) {
		double miles;
		double km;
		
		Scanner input = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�: ");
		miles = input.nextDouble();
		
		km = miles*1.609;
		System.out.println(miles + "������ " + km + "ų�ι��� �Դϴ�.");
	}
}