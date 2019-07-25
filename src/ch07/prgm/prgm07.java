package ch07.prgm;

import java.util.Scanner;

// 7. 사용자로부터 아이디를 받아서 미리 저장된 아이디와 일치하는지를 검사하는 프로그램.
public class prgm07 {

	public static void main(String[] args) {
		String id="hello";
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요: ");
		input=sc.next();
		
		if (input.equals(id) == false) {
			System.out.println("아이디가 일치하지 않습니다.");
		} else {
			System.out.println("아이디가 일치합니다.");
		}

	}

}
