package ch04.lab;

import java.util.Scanner;

/*
 * 1. ���簢���� �ѷ��� ������ ���ϴ� ���α׷�.
 * ���� = w, ���� = h
 * 
 * 1) �ʿ��� ���� w, h, area, perimeter
 * 2) ������ �ڷ����� �Ǽ��� ������ �� �ִ� double ��
 * 3) area = w*h;
 * 4) perimeter = 2*(w+h);
*/

public class Box {
	// String[] args: Ŀ�ǵ� ���ο��� �ڹٸ� �����ų �� �Ű������� ������ �� �ְ� �������ֱ� ���ؼ� ���
	public static void main(String[] args) {
		double w;
		double h;
		double area; 
		double perimeter;
		
//		w = 10.0;
//		h = 5.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�簢���� ���� ���̸� �Է��ϼ���: ");
		w = sc.nextDouble();
		
		System.out.print("�簢���� ���� ���̸� �Է��ϼ���: ");
		h = sc.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("�簢���� ����: " + area);
		System.out.println("�簢���� �ѷ�: " + perimeter);
	}
}
