package ch04.prgm;
// 1. 마일을 킬로미터로 변환하는 프로그램

import java.util.Scanner;

public class ConvertKM {
	public static void main(String[] args) {
		double miles;
		double km;
		
		Scanner input = new Scanner(System.in);
		System.out.print("마일을 입력하시오: ");
		miles = input.nextDouble();
		
		km = miles*1.609;
		System.out.println(miles + "마일은 " + km + "킬로미터 입니다.");
	}
}