package ch07.prgm;

import java.util.Scanner;

// 6. ����ڷκ��� ���� ���ڿ����� ������ ������ ������ ����Ͽ� ����ϴ� ���α׷�.
public class prgm06 {

	public static void main(String[] args) {
		String str;
		char ch;
		int cons = 0, vowel = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("���ڿ��� �Է����ּ���: ");
		str = sc.next();

		for (int i = 0; i < str.length(); i++) {
			ch = str.charAt(i);
			switch (ch) {
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vowel++;
				break;

			default:
				cons++;
				break;
			}
		}

		System.out.println("����: " + cons + "��, " + "����: " + vowel + "��");

	}

}
