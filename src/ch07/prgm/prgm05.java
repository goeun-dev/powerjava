package ch07.prgm;

import java.util.Scanner;

// 5. ���ڿ��� �������� ����ϴ� ���α׷�.
public class prgm05 { 

	public static void main(String[] args) {
		String text;
		char reverse;
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȯ�� ���ڿ��� �Է��ϼ���: ");
		text = sc.next();
		
		for (int i = text.length() - 1; i>=0; i--) {
			reverse = text.charAt(i);
			System.out.print(reverse);
		}

	}

}
