package ch06.prgm;

import java.util.Scanner;

// 3. 키를 입력받아서 표준 체중을 계산한 후에 사용자의 체중과 비교하여 저체중, 표준, 과체중인지를 판단하는 프로그램.
public class prgm03 {

	public static void main(String[] args) {
		double height, weight, standard;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("키를 입력하세요: ");
		height = sc.nextDouble();
		System.out.print("체중을 입력하세요: ");
		weight = sc.nextDouble();
		
		standard = (height - 100) * 0.9;
		
		if (weight > standard) {
			System.out.println("과체중입니다.");
		} else if (weight < standard) {
			System.out.println("저체중입니다.");
		} else {
			System.out.println("표준체중입니다.");
		}

	}

}
