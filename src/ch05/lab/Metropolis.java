package ch05.lab;

import java.util.Scanner;

// 1. 사용자가 여러 가지 값들을 입력하면 메트로폴리스인지를 판별하는 프로그램. 
public class Metropolis {

	public static void main(String[] args) {
		boolean isCapital;
		int citizens;
		int riches;

		Scanner sc = new Scanner(System.in);

		System.out.print("수도입니까?(수도: 1 수도아님: 0)");
		isCapital = (sc.nextInt() == 1) ? true : false;

		System.out.print("인구(단위: 만)");
		citizens = sc.nextInt();

		System.out.print("부자의 수(단위: 만)");
		riches = sc.nextInt();

		boolean isMetro = (isCapital && citizens >= 200) || (riches >= 50);

		System.out.println("메트로폴리스 여부: " + isMetro);

	}

}
