package ch05.lab;

import java.util.Scanner;

// [도전과제1] 사용자에게 연도를 입력받아 윤년인지를 검사하는 프로그램.
public class LeapYear {
	public static void main(String[] args) {
		int year;

		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		
		boolean isLeapYear = (year%4 == 0 && year%100 != 0 || year%400 == 0);
		
		System.out.println(year+"년의 윤년 여부: "+isLeapYear);
		
		
		
	}
}
