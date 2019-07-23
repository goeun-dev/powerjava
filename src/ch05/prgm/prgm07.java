package ch05.prgm;

import java.util.Scanner;

// 7. 평을 평방미터로 환산하는 프로그램.
public class prgm07 {

	public static void main(String[] args) {
		double p = 3.3058;
		double inputP;

		Scanner sc = new Scanner(System.in);
		System.out.print("평수를 입력하세요: ");
		inputP = sc.nextDouble();

		System.out.println(inputP + "평은 " + inputP * p + "평방미터입니다.");

	}

}
