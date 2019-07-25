package ch07.prgm;

import java.util.Scanner;

// 6. 사용자로부터 받은 문자열에서 자음과 모음의 개수를 계산하여 출력하는 프로그램.
public class prgm06 {

	public static void main(String[] args) {
		String str;
		char ch;
		int cons = 0, vowel = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해주세요: ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++;
				break;

			default:
				cons++;
				break;
			}
		}

		System.out.println("자음: " + cons + "개, " + "모음: " + vowel + "개");

	}

}
