package ch10.prgm;

import java.util.Scanner;
// 1. ���� ���� �ý���
public class prgm01 {

	public static void main(String[] args) {
		int[] seat = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		int isRsrv;

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.print("�¼��� �����Ͻðڽ��ϱ�?(1 �Ǵ� 0) ");
			isRsrv = sc.nextInt();
			if (isRsrv == 1) {
				System.out.println("���� ���� ���´� ������ �����ϴ�.");
				System.out.println("----------------------------------");
				System.out.println("1 2 3 4 5 6 7 8 9 10");
				System.out.println("----------------------------------");
				for (int value : seat) {
					System.out.print(value + " ");
				}
				System.out.print("���° �¼��� �����Ͻðڽ��ϱ�? ");
				int ch = sc.nextInt();
				seat[ch] = 1;
				System.out.println("����Ǿ����ϴ�.");
			} else {
				System.out.println("----------------------------------");
				System.out.println("������ �����մϴ�.");
				break;
			}
		}
	}
}
