package ch07.prgm;

// 1. 사각형을 나타내는 클래스 Rectangle를 만들어 객체를 생성하고 테스트하라.

class Rectangle {
	int w, h;

	// 넓이 반환
	int area() {
		return w * h;
	}

	// 둘레 반환
	int perimeter() {
		return w * 2 + h * 2;
	}
}

public class prgm01 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.w = 5;
		r.h = 17;
		System.out.println("사각형의 넓이: " + r.area());
		System.out.println("사각형의 둘레: " + r.perimeter());
	}

}
