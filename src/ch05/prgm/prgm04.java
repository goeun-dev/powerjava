package ch05.prgm;

import java.util.Scanner;

// 4. 원기둥의 부피를 구하는 프로그램.
public class prgm04 {

	public static void main(String[] args) {
		double radius, height;
		double PI = 3.141592;

		Scanner sc = new Scanner(System.in);
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = sc.nextDouble();
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = sc.nextDouble();

		System.out.println("원기둥의 부피는 " + radius * radius * PI * height + "입니다.");
	}

}
