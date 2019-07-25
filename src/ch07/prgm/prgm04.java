package ch07.prgm;

// 4. Movie 클래스를 작성하고 객체를 생성하여 테스트하라.
class Movie {
	String title, director;
	int year;
	double grade;

	void print() {
		System.out.println("제목: " + title + ", 평점: " + grade + ", 감독: " + director + ", 발표 연도: " + year);
	}
}

public class prgm04 {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.title = "레이디버드";
		m.director = "그레타 거윅";
		m.grade = 4.7;
		m.year = 2017;
		m.print();

	}

}
