package ch05.prgm;

import java.util.Scanner;

// 10. AC�� AE, BC�� �Է¹޾� DE�� ���ϴ� ���α׷�.
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
