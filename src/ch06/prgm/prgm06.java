package ch06.prgm;

import java.util.Scanner;

// 6. 2와 100 사이에 있는 모든 소수를 찾는 프로그램.
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
