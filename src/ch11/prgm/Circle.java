package ch11.prgm;

// programming 1��
class Circle {
	double radius;
	String color;

	public Circle() {
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public double getArea() {
		return radius * radius * 3.141592;
	}
}
