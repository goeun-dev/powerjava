package ch11.lab;

// 1) Ŭ���� Human ����
public class Human {
	String name;
	int age;

	// 2) ������ �ۼ�
	public Human(String name, int age) {
		this.name = name;
		this.age = age;

		// 11) Human �� Student Ŭ������ �����ڵ��� � ������ ȣ��Ǵ����� ȭ�鿡 ���
		System.out.println("Human ������()");
	}

	// 3) �����ڿ� ������ �ۼ�
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// 4) ��ü�� ���� ���� ��ȯ�ϴ� toString() �޼ҵ� �ۼ�
	public String toString() {
		return "name = " + name + ", age = " + age;
	}

	public String getProfession() {
		return "human";
	}

	// 5) main() �޼ҵ� �߰��ѵ� ��ü�� �����ϰ� �� ��ü�� toString ȣ���Ͽ� ���
	public static void main(String[] args) {
		Human h1, h2, h3;
		h1 = new Human("����", 18);
		h2 = new Human("����", 21);
		h3 = new Human("���", 30);

		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
	}
}
