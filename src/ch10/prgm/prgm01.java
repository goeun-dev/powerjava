package ch10.prgm;

import java.util.Scanner;
// 1. 극장 예약 시스템
public class prgm01 {

	public static void main(String[] args) {
		int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int isRsrv;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("좌석을 예약하시겠습니까?(1 또는 0) ");
			isRsrv = sc.nextInt();
			if (isRsrv == 1) {
				System.out.println("현재 예약 상태는 다음과 같습니다.");
				System.out.println("----------------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("----------------------------------");
				for (int value : seat) {
					System.out.print(value + " ");
				}
				System.out.print("몇번째 좌석을 예약하시겠습니까? ");
				int ch = sc.nextInt();
				seat[ch] = 1;
				System.out.println("예약되었습니다.");
			} else {
				System.out.println("----------------------------------");
				System.out.println("예약을 종료합니다.");
				break;
			}
		}
	}
}
