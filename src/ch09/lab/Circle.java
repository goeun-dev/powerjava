package ch09.lab;

public class Circle {
	private double radius;
	static final double PI = 3.141592;

	// 1) 원의 반지름을 매개 변수로 받는 생성자
	public Circle(double r) {
		this.radius = r;
	}

	// 2) 설정자 메소드와 접근자 메소드를 작성
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	// 3) double 형의 값을 제곱하여 반환하는 square() 메소드 작성
	private double square(double d) {
		return d * d;
	}

	// 4) 원의 면적을 계산하는 getArea() 메소드 작성 (square() 메소드를 사용)
	public double getArea() {
		return square(radius) * PI;
	}

	// 5) 원의 둘레를 계산하는 getParameter() 메소드 작성
	public double getParimeter() {
		return radius * 2 * PI;
	}

	// 6) PI 값을 반환하는 정적 메소드 작성
	static double getPI() {
		return PI;
	}

	public static void main(String[] args) {
		// 7) Circle 클래스 안의 main 메소드 안에서 square() 메소드를 호출하고 결과와 이유 작성
		// square(10.0);
		// 정적 메소드에서 인스턴스 메소드를 호출했기 때문에 오류가 발생한다.

		// 8) main() 안에서 정적 메소드인 getPI()를 호출해보라.
		System.out.println(getPI());

	}

}
