package ch10.prgm;

import java.util.Scanner;

// 2. 입력 값들의 분포를 시각적으로 볼 수 있는 히스토그램을 만드는 프로그램.
public class prgm02 {

	public static void main(String[] args) {
		int[] array = new int[10];
		int num = 0;
		Scanner input = new Scanner(System.in);

		for (int i = 0; i < array.length; i++) {
			System.out.print("1~100 사이의 정수를 입력하세요: ");
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
