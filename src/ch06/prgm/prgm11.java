package ch06.prgm;

import java.util.Scanner;

// 11. 연, 월, 일을 받아서 무슨 요일인지를 출력하는 프로그램.
public class prgm11 {

	public static void main(String[] args) {
		int year, month, day;
		int total_day = 0;
		String week = null;

		Scanner sc = new Scanner(System.in);
		System.out.print("연도를 입력하세요: ");
		year = sc.nextInt();
		System.out.print("월을 입력하세요: ");
		month = sc.nextInt();
		System.out.print("일을 입력하세요: ");
		day = sc.nextInt();

		total_day += (year - 1900) * 365;
		total_day += (year - 1900) / 4;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			if (month == 1 || month == 2) {
				total_day -= 1;
			}
		}
		// 주어진 월과 일까지의 날수를 더한다.
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
			week = "일";
			break;
		case 1:
			week = "월";
			break;
		case 2:
			week = "화";
			break;
		case 3:
			week = "수";
			break;
		case 4:
			week = "목";
			break;
		case 5:
			week = "금";
			break;
		case 6:
			week = "토";
			break;

		default:
			break;
		}

		System.out.println(year + "년 " + month + "월 " + day + "일은 " + week + "요일입니다.");

	}

}
