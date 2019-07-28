package ch09.lab;

public class Circle {
	private double radius;
	static final double PI = 3.141592;

	// 1) ���� �������� �Ű� ������ �޴� ������
	public Circle(double r) {
		this.radius = r;
	}

	// 2) ������ �޼ҵ�� ������ �޼ҵ带 �ۼ�
	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	// 3) double ���� ���� �����Ͽ� ��ȯ�ϴ� square() �޼ҵ� �ۼ�
	private double square(double d) {
		return d * d;
	}

	// 4) ���� ������ ����ϴ� getArea() �޼ҵ� �ۼ� (square() �޼ҵ带 ���)
	public double getArea() {
		return square(radius) * PI;
	}

	// 5) ���� �ѷ��� ����ϴ� getParameter() �޼ҵ� �ۼ�
	public double getParimeter() {
		return radius * 2 * PI;
	}

	// 6) PI ���� ��ȯ�ϴ� ���� �޼ҵ� �ۼ�
	static double getPI() {
		return PI;
	}

	public static void main(String[] args) {
		// 7) Circle Ŭ���� ���� main �޼ҵ� �ȿ��� square() �޼ҵ带 ȣ���ϰ� ����� ���� �ۼ�
		// square(10.0);
		// ���� �޼ҵ忡�� �ν��Ͻ� �޼ҵ带 ȣ���߱� ������ ������ �߻��Ѵ�.

		// 8) main() �ȿ��� ���� �޼ҵ��� getPI()�� ȣ���غ���.
		System.out.println(getPI());

	}

}
