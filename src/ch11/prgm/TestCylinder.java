package ch11.prgm;

// programming 1��
public class TestCylinder {

	public static void main(String[] args) {
		Cylinder obj1 = new Cylinder();
		Cylinder obj2 = new Cylinder(5.0, 3.0);

		// obj1�� ��� �Ӽ��� �����ڸ� ���Ͽ� ���
		System.out.println("�� obj1�� ������: " + obj1.getRadius());
		System.out.println("�� obj1�� ����: " + obj1.getArea());
		System.out.println("����� obj1�� ����: " + obj1.getHeight());
		System.out.println("����� obj1�� ����: " + obj1.getVolume());

		// obj2�� ��� �Ӽ��� �����ڸ� ���Ͽ� ���
		System.out.println("�� obj2�� ������: " + obj2.getRadius());
		System.out.println("�� obj2�� ����: " + obj2.getArea());
		System.out.println("����� obj2�� ����: " + obj2.getHeight());
		System.out.println("����� obj2�� ����: " + obj2.getVolume());

	}

}
