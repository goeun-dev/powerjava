package ch07.prgm;

// 4. Movie Ŭ������ �ۼ��ϰ� ��ü�� �����Ͽ� �׽�Ʈ�϶�.
class Movie {
	String title, director;
	int year;
	double grade;

	void print() {
		System.out.println("����: " + title + ", ����: " + grade + ", ����: " + director + ", ��ǥ ����: " + year);
	}
}

public class prgm04 {

	public static void main(String[] args) {
		Movie m = new Movie();
		m.title = "���̵����";
		m.director = "�׷�Ÿ ����";
		m.grade = 4.7;
		m.year = 2017;
		m.print();

	}

}
