package ch06.prgm;

import java.util.Scanner;

// 11. ��, ��, ���� �޾Ƽ� ���� ���������� ����ϴ� ���α׷�.
public class prgm11 {

	public static void main(String[] args) {
		int year, month, day;
		int total_day = 0;
		String week = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("������ �Է��ϼ���: ");
		year = sc.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		month = sc.nextInt();
		System.out.print("���� �Է��ϼ���: ");
		day = sc.nextInt();

		total_day += (year - 1900) * 365;
		total_day += (year - 1900) / 4;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			if (month == 1 || month == 2) {
				total_day -= 1;
			}
		}
		// �־��� ���� �ϱ����� ������ ���Ѵ�.
		switch (month) {
		  case 1:
		   total_day += 0;
		   break;
		  case 2:
		   total_day += 31;
		   break;
		  case 3:
		   total_day += 59;// 31+28;
		   break;
		  case 4:
		   total_day += 90;// 31+28+31;
		   break;
		  case 5:
		   total_day += 120;// 31+28+31+30;
		   break;
		  case 6:
		   total_day += 151;// 31+28+31+30+31;
		   break;
		  case 7:
		   total_day += 181;// 31+28+31+30+31+30;
		   break;
		  case 8:
		   total_day += 212;// 31+28+31+30+31+30+31;
		   break;
		  case 9:
		   total_day += 243;// 31+28+31+30+31+30+31+31;
		   break;
		  case 10:
		   total_day += 273;// 31+28+31+30+31+30+31+31+30;
		   break;
		  case 11:
		   total_day += 304;// 31+28+31+30+31+30+31+31+30+31;
		   break;
		  case 12:
		   total_day += 334;// 31+28+31+30+31+30+31+31+30+31+30;
		   break;
		  }

		total_day += day;
		int x = total_day % 7;

		switch (x) {
		case 0:
			week = "��";
			break;
		case 1:
			week = "��";
			break;
		case 2:
			week = "ȭ";
			break;
		case 3:
			week = "��";
			break;
		case 4:
			week = "��";
			break;
		case 5:
			week = "��";
			break;
		case 6:
			week = "��";
			break;

		default:
			break;
		}

		System.out.println(year + "�� " + month + "�� " + day + "���� " + week + "�����Դϴ�.");

	}

}
