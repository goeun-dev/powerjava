package ch05.prgm;

import java.util.Scanner;

// 2. 두 개의 정수를 입력받아서, 큰 수를 작은 수로 나눈 몫과 나머지를 출력하는 프로그램.
public class prgm02 {

	public static void main(String[] args) {
		int num1;
		int num2;

		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력하시오: ");
		num1 = sc.nextInt();
		System.out.print("정수를 입력하시오: ");
		num2 = sc.nextInt();

		System.out.println(num2 + "을 " + num1 + "로 나눈 몫은 " + num2 / num1 + "이고 나머지는" + num2 % num1 + "입니다.");

	}

}
