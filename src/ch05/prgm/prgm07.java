package ch05.prgm;

import java.util.Scanner;

// 7. ���� �����ͷ� ȯ���ϴ� ���α׷�.
public class prgm07 {

	public static void main(String[] args) {
		double p = 3.3058;
		double inputP;

		Scanner sc = new Scanner(System.in);
		System.out.print("����� �Է��ϼ���: ");
		inputP = sc.nextDouble();

		System.out.println(inputP + "���� " + inputP * p + "�������Դϴ�.");

	}

}
