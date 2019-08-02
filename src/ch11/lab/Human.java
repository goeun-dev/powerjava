package ch11.lab;

// 1) 클래스 Human 정의
public class Human {
	String name;
	int age;

	// 2) 생성자 작성
	public Human(String name, int age) {
		this.name = name;
		this.age = age;

		// 11) Human 과 Student 클래스의 생성자들이 어떤 순서로 호출되는지를 화면에 출력
		System.out.println("Human 생성자()");
	}

	// 3) 접근자와 설정자 작성
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

	// 4) 객체의 현재 값을 반환하는 toString() 메소드 작성
	public String toString() {
		return "name = " + name + ", age = " + age;
	}

	public String getProfession() {
		return "human";
	}

	// 5) main() 메소드 추가한뒤 객체를 생성하고 각 객체의 toString 호출하여 출력
	public static void main(String[] args) {
		Human h1, h2, h3;
		h1 = new Human("춘향", 18);
		h2 = new Human("몽룡", 21);
		h3 = new Human("사또", 30);

		System.out.println(h1.toString());
		System.out.println(h2.toString());
		System.out.println(h3.toString());
	}
}
