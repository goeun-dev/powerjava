package ch06.prgm;

import java.util.Scanner;

// 6. 2�� 100 ���̿� �ִ� ��� �Ҽ��� ã�� ���α׷�.
public class prgm06 {

	public static void main(String[] args) {
		for (int i = 2; i < 100; i++) {
			boolean isPrime = true;
			for (int k = 2; k < i; k++) {
				if (i % k == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
	}
}
