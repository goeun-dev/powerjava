package ch06.prgm;

import java.util.Scanner;

// 3. Ű�� �Է¹޾Ƽ� ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ� ��ü��, ǥ��, ��ü�������� �Ǵ��ϴ� ���α׷�.
public class prgm03 {

	public static void main(String[] args) {
		double height, weight, standard;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Ű�� �Է��ϼ���: ");
		height = sc.nextDouble();
		System.out.print("ü���� �Է��ϼ���: ");
		weight = sc.nextDouble();
		
		standard = (height - 100) * 0.9;
		
		if (weight > standard) {
			System.out.println("��ü���Դϴ�.");
		} else if (weight < standard) {
			System.out.println("��ü���Դϴ�.");
		} else {
			System.out.println("ǥ��ü���Դϴ�.");
		}

	}

}
