package ch11.lab;

// 6) Human Ŭ���� ����Ͽ� Student Ŭ���� �ۼ�
public class Student extends Human {
	String major;

	// 7) ������ ����, �θ� Ŭ������ ������ ȣ��
	public Student(String name, int age, String major) {
		super(name, age);
		this.major = major;

		// 11) Human �� Student Ŭ������ �����ڵ��� � ������ ȣ��Ǵ����� ȭ�鿡 ���
		System.out.println("Student ������()");
	}

	// 8) �����ڿ� ������ �ۼ�
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	// 9) toString() �ۼ�, �θ��� toString() ȣ���Ͽ� ���ڿ� ����
	@Override
	public String toString() {
		return super.toString() + ", major = " + major;
	}

	// 13) ������ ��ȯ�ϴ� �޼ҵ带 �ۼ��ϰ� ������
	@Override
	public String getProfession() {
		return "student";
	}

	// 10) main() �޼ҵ� �߰��ѵ� ��ü�� �����ϰ� �� ��ü�� toString ȣ���Ͽ� ���
	public static void main(String[] args) {
		Student s1, s2, s3;
		s1 = new Student("����", 21, "��ǻ��");
		s2 = new Student("����", 22, "�濵");
		s3 = new Student("����", 24, "����");

		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());

		System.out.println(s1.getProfession());
	}
}
