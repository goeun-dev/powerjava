package ch04.prgm;

import java.util.Scanner;

// 4. ����ڷκ��� ȭ�� �µ��� �޾Ƽ� ���� �µ��� ȯ���Ͽ� ����ϴ� ���α׷�.
public class ConvertTemperature {

	public static void main(String[] args) {
		double F; // ȭ�� �µ�
		double C; // ���� �µ�
		
		Scanner input = new Scanner(System.in);
		System.out.print("ȭ�� �µ��� �Է��ϼ���: ");
		F = input.nextDouble();
		
		// C = 5/9*(F-32); �� ����� �׻� 0�� ����
		// 5/9�� ����� 0�̱� ������ �� �ǿ����� �� ��� ������ �ݵ�� float�� double�� �ؾ߸� �Ǽ� ������ ����� ���� �� �ִ�.
		C = 5/(double)9*(F-32);
		
		System.out.println("ȭ�� �µ�: "+F+", ���� �µ�: "+C);

	}

}
