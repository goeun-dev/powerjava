package ch06.prgm;

import java.util.Scanner;

// 2. Ű���忡�� ������ �ϳ��� �о ������ ������ �����ϴ� ���α׷�. switch �� ���.
public class prgm02 {

	public static void main(String[] args) {
		String key;
		Scanner sc = new Scanner(System.in);
		// toLowerCase() �� ����� ���ڿ��� ��� �ҹ��ڷ� �ٲ��ش�.
		System.out.print("���ڸ� �Է��ϼ���: ");
		key = sc.next().toLowerCase();
		switch (key) {
		case "a": case "e": case "i": case "o": case "u": // ������ ���
			System.out.println("������ �Է��߽��ϴ�.");
			break;
		default:
			System.out.println("������ �Է��߽��ϴ�.");
			break;
		}

	}

}
