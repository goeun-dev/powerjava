package ch06.prgm;

import java.util.Scanner;

// 10. 피보나치 수열을 구하는 프로그램
public class prgm10 {

	public static void main(String[] args) {
		long a = 0, b = 1, c;
		int i, end;
		Scanner sc = new Scanner(System.in);
		System.out.print("출력할 항의 수를 입력하세요: ");
		end = sc.nextInt();
		
		System.out.print(a + " " + b + " ");
		for (i = 2; i < end; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
