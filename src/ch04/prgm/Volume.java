package ch04.prgm;

import java.util.Scanner;

// 3. ���� �������� �Է¹޾Ƽ� ���Ǹ� ����Ͽ� ����ϴ� ���α׷�. �Է�/��� ��� �Ǽ���.
public class Volume {
	public static void main(String[] ars) {
		double radius;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� �������� �Է��ϼ���: ");
		radius = input.nextDouble();
		
		volume = 4/3*radius*radius*radius;
		System.out.println("���� ���Ǵ�: "+volume);
	}
}
