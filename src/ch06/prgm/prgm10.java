package ch06.prgm;

import java.util.Scanner;

// 10. �Ǻ���ġ ������ ���ϴ� ���α׷�
public class prgm10 {

	public static void main(String[] args) {
		long a = 0, b = 1, c;
		int i, end;
		Scanner sc = new Scanner(System.in);
		System.out.print("����� ���� ���� �Է��ϼ���: ");
		end = sc.nextInt();
		
		System.out.print(a + " " + b + " ");
		for (i = 2; i < end; i++) {
			c = a + b;
			System.out.print(c + " ");
			a = b;
			b = c;
		}

	}

}
