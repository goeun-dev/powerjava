package ch10.prgm;

import java.util.Scanner;

// 3. 학생들의 성적을 받아서 평균을 구하는 프로그램.
public class prgm03 {

	public static void main(String[] args) {
		int size;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("학생의 수를 입력하시오: ");
		size = sc.nextInt();

		int[] student = new int[size];
		for (int i = 0; i < student.length; i++) {
			System.out.printf("학생%d의 성적을 입력하시오: ", i);
			int score = sc.nextInt();
			if (score > 100 || score < 0) {
				System.out.println("잘못된 성적입니다. 다시 입력하세요.");
				i--;
			} else {
				student[i] = score;
				sum += score;
			}
		}
		System.out.println("성적 평균은 "+(double)sum/(double)student.length+"입니다.");
	}
}
