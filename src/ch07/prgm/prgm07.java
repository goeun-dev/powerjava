package ch07.prgm;

import java.util.Scanner;

// 7. ����ڷκ��� ���̵� �޾Ƽ� �̸� ����� ���̵�� ��ġ�ϴ����� �˻��ϴ� ���α׷�.
public class prgm07 {

	public static void main(String[] args) {
		String id="hello";
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("���̵� �Է��ϼ���: ");
		input=sc.next();
		
		if (input.equals(id) == false) {
			System.out.println("���̵� ��ġ���� �ʽ��ϴ�.");
		} else {
			System.out.println("���̵� ��ġ�մϴ�.");
		}

	}

}
