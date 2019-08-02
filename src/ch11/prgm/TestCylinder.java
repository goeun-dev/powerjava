package ch11.prgm;

// programming 1번
public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);

		// obj1의 모든 속성을 접근자를 통하여 출력
		System.out.println("원 obj1의 반지름: " + obj1.getRadius());
		System.out.println("원 obj1의 넓이: " + obj1.getArea());
		System.out.println("원기둥 obj1의 높이: " + obj1.getHeight());
		System.out.println("원기둥 obj1의 부피: " + obj1.getVolume());

		// obj2의 모든 속성을 접근자를 통하여 출력
		System.out.println("원 obj2의 반지름: " + obj2.getRadius());
		System.out.println("원 obj2의 넓이: " + obj2.getArea());
		System.out.println("원기둥 obj2의 높이: " + obj2.getHeight());
		System.out.println("원기둥 obj2의 부피: " + obj2.getVolume());

	}

}
