package ch10.prgm;

import java.util.Scanner;

// 2. �Է� ������ ������ �ð������� �� �� �ִ� ������׷��� ����� ���α׷�.
public class prgm02 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int num = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("1~100 ������ ������ �Է��ϼ���: ");
			num = input.nextInt();
			array[(num - 1) / 10]++;
		}

		for (int i = 0; i < 10; i++) {
			System.out.printf("%d - %d: ", (i * 10) + 1, (i + 1) * 10);
			for (int j = 0; j < array[i]; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
