package ch07.prgm;

// 1. �簢���� ��Ÿ���� Ŭ���� Rectangle�� ����� ��ü�� �����ϰ� �׽�Ʈ�϶�.

class Rectangle {
	int w, h;

	// ���� ��ȯ
	int area() {
		return w * h;
	}

	// �ѷ� ��ȯ
	int perimeter() {
		return w * 2 + h * 2;
	}
}

public class prgm01 {

	public static void main(String[] args) {
		Rectangle r = new Rectangle();
		r.w = 5;
		r.h = 17;
		System.out.println("�簢���� ����: " + r.area());
		System.out.println("�簢���� �ѷ�: " + r.perimeter());
	}

}
