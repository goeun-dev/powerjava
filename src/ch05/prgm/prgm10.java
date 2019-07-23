package ch05.prgm;

import java.util.Scanner;

// 10. AC와 AE, BC를 입력받아 DE를 구하는 프로그램.
public class prgm10 {

	public static void main(String[] args) {
		double AC, AE, BC, DE;

		Scanner sc = new Scanner(System.in);
		System.out.print("AC: ");
		AC = sc.nextDouble();
		System.out.print("AE: ");
		AE = sc.nextDouble();
		System.out.print("BC: ");
		BC = sc.nextDouble();

		DE = AE * BC / AC;
		System.out.println("DE:" + DE);

	}

}
