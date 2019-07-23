package ch05.prgm;

import java.util.Scanner;

// 3. cm로 표현된 키를 입력하여 피트와 인치로 변환하는 프로그램.
public class prgm03 {
	public static void main(String[] args) {
		double cm, inch;
		int feet;

		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하시오: ");
		cm = sc.nextDouble();
		inch = cm / 2.54;
		feet = (int) inch / 12;
		inch = inch - (12 * feet);

		System.out.println((int) cm + "cm는 " + feet + "피트 " + inch + "인치입니다.");
	}
}
