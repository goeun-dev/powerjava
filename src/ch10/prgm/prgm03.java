package ch10.prgm;

import java.util.Scanner;

// 3. �л����� ������ �޾Ƽ� ����� ���ϴ� ���α׷�.
public class prgm03 {

	public static void main(String[] args) {
		int size;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("�л��� ���� �Է��Ͻÿ�: ");
		size = sc.nextInt();

		int[] student = new int[size];
		for (int i = 0; i < student.length; i++) {
			System.out.printf("�л�%d�� ������ �Է��Ͻÿ�: ", i);
			int score = sc.nextInt();
			if (score > 100 || score < 0) {
				System.out.println("�߸��� �����Դϴ�. �ٽ� �Է��ϼ���.");
				i--;
			} else {
				student[i] = score;
				sum += score;
			}
		}
		System.out.println("���� ����� "+(double)sum/(double)student.length+"�Դϴ�.");
	}
}
