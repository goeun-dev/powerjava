package ch06.lab;

import java.util.Scanner;

// 사용자가 입력한 반복 횟수까지 무한 수열을 계산하는 프로그램.
public class CalPi {

	public static void main(String[] args) {
		double divisor, divident, sum;
		int loop_count;

		Scanner sc = new Scanner(System.in);
		divisor = 1.0; // 분모
		divident = 4.0; // 분자
		sum = 0.0;
		System.out.print("반복횟수: ");
		// 사용자로 부터 반복 횟수를 입력받는다.
		loop_count = sc.nextInt();

		while (loop_count > 0) {
			sum = sum + divident / divisor;
			divident = -1.0 * divident;
			divisor = divisor + 2;
			loop_count--;
		}

		System.out.println("Pi = " + sum);

	}

}
