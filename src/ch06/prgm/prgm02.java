package ch06.prgm;

import java.util.Scanner;

// 2. 키보드에서 영문자 하나를 읽어서 모음과 자음을 구분하는 프로그램. switch 문 사용.
public class prgm02 {

	public static void main(String[] args) {
		String key;
		Scanner sc = new Scanner(System.in);
		// toLowerCase() 를 사용해 문자열을 모두 소문자로 바꿔준다.
		System.out.print("문자를 입력하세요: ");
		key = sc.next().toLowerCase();
		switch (key) {
		case "a": case "e": case "i": case "o": case "u": // 모음일 경우
			System.out.println("모음을 입력했습니다.");
			break;
		default:
			System.out.println("자음을 입력했습니다.");
			break;
		}

	}

}
