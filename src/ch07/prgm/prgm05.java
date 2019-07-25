package ch07.prgm;

import java.util.Scanner;

// 5. 문자열을 역순으로 출력하는 프로그램.
public class prgm05 { 

	public static void main(String[] args) {
		String text;
		char reverse;
		Scanner sc = new Scanner(System.in);
		System.out.print("변환할 문자열을 입력하세요: ");
		text = sc.next();
		
		for (int i = text.length() - 1; i>=0; i--) {
			reverse = text.charAt(i);
			System.out.print(reverse);
		}

	}

}
