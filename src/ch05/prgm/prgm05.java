package ch05.prgm;

import java.util.Scanner;

// 5. 상자의 체적을 구하는 프로그램.
public class prgm05 {

	public static void main(String[] args) {
		// 100이하의 정수만 받기 위해 byte를 사용
		byte length, width, height;

		Scanner sc = new Scanner(System.in);
		System.out.print("상자의 길이: ");
		length = sc.nextByte();
		System.out.print("상자의 너비: ");
		width = sc.nextByte();
		System.out.print("상자의 높이: ");
		height = sc.nextByte();

		System.out.println("상자의 체적은 " + length * width * height);
	}

}
