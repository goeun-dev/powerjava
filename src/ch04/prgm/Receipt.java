package ch04.prgm;

import java.util.Scanner;

// 2. ������ ��ǰ�� ���ݰ� �մ����� ���� �ݾ��� �Է��ϸ� �ΰ����� �ܵ��� ����ϴ� ���α׷�.
public class Receipt {

	public static void main(String[] args) {
		// ���� ��
		int rprice;
		// ��ǰ�� �Ѿ�
		int total;
		// �ΰ���
		int vat;
		// �ܵ�
		int changes;
		
		Scanner input = new Scanner(System.in);
		System.out.print("���� ��: ");
		rprice = input.nextInt();
		System.out.print("��ǰ�� �Ѿ�: ");
		total = input.nextInt();
		
		vat = total/10;
		changes = rprice-total;
		
		System.out.println("�ΰ���: " + vat);
		System.out.println("�ܵ�: " + changes);
	}

}
