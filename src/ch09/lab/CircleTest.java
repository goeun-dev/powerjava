package ch09.lab;

public class CircleTest {

	public static void main(String[] args) {
		// 9) Circle 객체를 생성하고 getArea()와 getPerimeter()를 호출하여 원의 면적과 둘레를 구하라.
		Circle circle = new Circle(5.0); // 객체 생성, 생성자 호출시 반지름을 5.0으로 설정
		System.out.println("원의 면적: " + circle.getArea()); // 원의 면적 계산하여 출력
		System.out.println("원의 둘레: " + circle.getParimeter()); // 원의 둘레 계산하여 출력
	}

}
