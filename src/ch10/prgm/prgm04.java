package ch10.prgm;

import java.util.Scanner;

// 4. 16������ ���ڿ��� 2������ ���ڿ��� ��ȯ�ϴ� ���α׷�. 
public class prgm04 {

	public static void main(String[] args) {
		String[] hexa2bin = { "0000", "0001", "0010", "0011", "0100", "0101", "0110", "0111", "1000", "1001", "1010",
				"1011", "1100", "1101", "1110", "1111" };
		String hexa;

		Scanner sc = new Scanner(System.in);
		System.out.print("16���� ���ڿ��� �Է��Ͻÿ�: ");
		hexa = sc.next();
System.out.print(hexa+"�� ���� ������: ");
		for (int i = 0; i < hexa.length(); i++) {
			switch (hexa.charAt(i)) {
			case '0':
				System.out.print(hexa2bin[0]);
				break;
			case '1':
				System.out.print(hexa2bin[1]);
				break;
			case '2':
				System.out.print(hexa2bin[2]);
				break;
			case '3':
				System.out.print(hexa2bin[3]);
				break;
			case '4':
				System.out.print(hexa2bin[4]);
				break;
			case '5':
				System.out.print(hexa2bin[5]);
				break;
			case '6':
				System.out.print(hexa2bin[6]);
				break;
			case '7':
				System.out.print(hexa2bin[7]);
				break;
			case '8':
				System.out.print(hexa2bin[8]);
				break;
			case '9':
				System.out.print(hexa2bin[9]);
				break;
			case 'a':
				System.out.print(hexa2bin[10]);
				break;
			case 'b':
				System.out.print(hexa2bin[11]);
				break;
			case 'c':
				System.out.print(hexa2bin[12]);
				break;
			case 'd':
				System.out.print(hexa2bin[13]);
				break;
			case 'e':
				System.out.print(hexa2bin[14]);
				break;
			case 'f':
				System.out.print(hexa2bin[15]);
				break;
			default:
				System.out.println("�߸��� ���Դϴ�.");
			}
			System.out.print(" ");
		}

	}

}
