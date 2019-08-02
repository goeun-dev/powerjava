package ch11.lab;

// 6) Human 클래스 상속하여 Student 클래스 작성
public class Student extends Human {
	String major;

	// 7) 생성자 정의, 부모 클래스의 생성자 호출
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;

		// 11) Human 과 Student 클래스의 생성자들이 어떤 순서로 호출되는지를 화면에 출력
		System.out.println("Student 생성자()");
	}

	// 8) 접근자와 변경자 작성
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// 9) toString() 작성, 부모의 toString() 호출하여 문자열 생성
	@Override
	public String toString() {
		return super.toString() + ", major = " + major;
	}

	// 13) 직업을 반환하는 메소드를 작성하고 재정의
	@Override
	public String getProfession() {
		return "student";
	}

	// 10) main() 메소드 추가한뒤 객체를 생성하고 각 개체의 toString 호출하여 출력
	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student("명진", 21, "컴퓨터");
		s2 = new Student("미현", 22, "경영");
		s3 = new Student("용준", 24, "경제");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

		System.out.println(s1.getProfession());
	}
}
