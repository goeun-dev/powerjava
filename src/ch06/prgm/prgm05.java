package ch06.prgm;

import java.util.Scanner;

// 5. ����ڷ� ���� x���� �Է� �޾� �Լ����� ����ϴ� ���α׷�. (x�� �Ǽ�)
public class prgm05 {

	public static void main(String[] args) {
		double x;

		Scanner sc = new Scanner(System.in);
		System.out.print("x���� �Է��ϼ���: ");
		x = sc.nextDouble();

		if (x >= 0) {
			System.out.println(x * x * x - 9 * x + 2);
		} else {
			System.out.println(7 * x + 2);
		}
	}

}
