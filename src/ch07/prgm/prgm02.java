package ch07.prgm;

// 2. 날짜를 나타내는 클래스 Date를 작성하고 객체를 생성하여서 테스트하라.
class Date {
	int year, month, day;

	// "연도.월.일"의 형태로 출력하는 메소드.
	void print1() {
		System.out.println(year + "." + month + "." + day);
	}

	// "July 일,연도"의 형태로 출력하는 메소드.
	void print2() {
		String m;
		switch (month) {
		case 1:
			m = "January";
			break;
		case 2:
			m = "February";
			break;
		case 3:
			m = "March";
			break;
		case 4:
			m = "April";
			break;
		case 5:
			m = "May";
			break;
		case 6:
			m = "June";
			break;
		case 7:
			m = "July";
			break;
		case 8:
			m = "August";
			break;
		case 9:
			m = "September";
			break;
		case 10:
			m = "October";
			break;
		case 11:
			m = "November";
			break;
		case 12:
			m = "December";
			break;
		default:
			m = "잘못된 월을 입력했습니다.";
			break;
		}

		System.out.println(m +" "+ day + "," + year);
	}
}

public class prgm02 {

	public static void main(String[] args) {
		Date d = new Date();
		d.year = 2019;
		d.month = 7;
		d.day = 25;
		
		d.print1();
		d.print2();
	}

}
