package ch04.lab;

import java.util.Scanner;

/*
 * 1. 직사각형의 둘레와 면적을 구하는 프로그램.
 * 가로 = w, 세로 = h
 * 
 * 1) 필요한 변수 w, h, area, perimeter
 * 2) 변수의 자료형은 실수를 저장할 수 있는 double 형
 * 3) area = w*h;
 * 4) perimeter = 2*(w+h);
*/

public class Box {
	// String[] args: 커맨드 라인에서 자바를 실행시킬 때 매개변수를 전달할 수 있게 지원해주기 위해서 사용
	public static void main(String[] args) {
		double w;
		double h;
		double area; 
		double perimeter;
		
//		w = 10.0;
//		h = 5.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("사각형의 가로 길이를 입력하세요: ");
		w = sc.nextDouble();
		
		System.out.print("사각형의 세로 길이를 입력하세요: ");
		h = sc.nextDouble();
		
		area = w*h;
		perimeter = 2*(w+h);
		
		System.out.println("사각형의 넓이: " + area);
		System.out.println("사각형의 둘레: " + perimeter);
	}
}
