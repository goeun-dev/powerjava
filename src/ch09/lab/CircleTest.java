package ch09.lab;

public class CircleTest {

	public static void main(String[] args) {
		// 9) Circle ��ü�� �����ϰ� getArea()�� getPerimeter()�� ȣ���Ͽ� ���� ������ �ѷ��� ���϶�.
		Circle circle = new Circle(5.0); // ��ü ����, ������ ȣ��� �������� 5.0���� ����
		System.out.println("���� ����: " + circle.getArea()); // ���� ���� ����Ͽ� ���
		System.out.println("���� �ѷ�: " + circle.getParimeter()); // ���� �ѷ� ����Ͽ� ���
	}

}
