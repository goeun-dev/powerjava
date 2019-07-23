package ch05.prgm;

import java.util.Scanner;

// 1. 사용자에게 이름과 나이를 물어보고 화면에 이름과 나이를 다시 출력하는 프로그램.
public class prgm01 {

	public static void main(String[] args) {
		String name;
		int age;

		Scanner sc = new Scanner(System.in);
		System.out.print("이름: ");
		name = sc.next();
		System.out.print("나이: ");
		age = sc.nextInt();

		System.out.println("이름은 " + name + "이고 나이는 " + age + "세입니다.");

	}

}
