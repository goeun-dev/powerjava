package ch08.prgm;

// 1. Circle Ŭ������ �ۼ��ϰ� ��ü�� �����Ͽ��� �׽�Ʈ�϶�.
class Circle {
	double r;
	double cx;
	double cy;

	public void setR(double r) {
		this.r = r;
	}

	public double getR() {
		return r;
	}

	public double getCx() {
		return cx;
	}

	public void setCx(Double cx) {
		this.cx = cx;
	}

	public double getCy() {
		return cy;
	}

	public void setCy(double cy) {
		this.cy = cy;
	}

	public double area() {
		return 3.141592 * r * r;
	}

}

public class prgm01 {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		c1.setR(14);
		System.out.println(c1.area());

	}

}
