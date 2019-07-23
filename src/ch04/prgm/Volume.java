package ch04.prgm;

import java.util.Scanner;

// 3. 구의 반지름을 입력받아서 부피를 계산하여 출력하는 프로그램. 입력/출력 모두 실수형.
public class Volume {
	public static void main(String[] ars) {
		double radius;
		double volume;
		
		Scanner input = new Scanner(System.in);
		System.out.print("구의 반지름을 입력하세요: ");
		radius = input.nextDouble();
		
		volume = 4/3*radius*radius*radius;
		System.out.println("구의 부피는: "+volume);
	}
}
