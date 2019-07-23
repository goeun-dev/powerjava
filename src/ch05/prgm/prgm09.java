package ch05.prgm;

import java.util.Scanner;

// 9. 사용자로부터 물체에 주어진 힘과 물체의 면적을 입력받아서 압력의 세기를 계산하는 프로그램.
public class prgm09 {

	public static void main(String[] args) {
		double p, s;

		Scanner sc = new Scanner(System.in);
		System.out.print("힘: ");
		p = sc.nextDouble();
		System.out.print("면적: ");
		s = sc.nextDouble();

		System.out.println("압력의 세기: " + p / s);

	}

}
