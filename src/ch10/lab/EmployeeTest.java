package ch10.lab;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// ũ�Ⱑ 3�� Employee�� �迭 employees�� �����Ѵ�.
		Employee[] employees = new Employee[1];

		// 3���� ��� ������ �޾Ƽ� ���� Employee ��ü�� ������ �Ŀ� �迭�� �߰��Ͽ� ����.
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();

			System.out.print("�̸��� �Է��ϼ���: ");
			employees[i].name = scan.next();

			System.out.print("�ּҸ� �Է��ϼ���: ");
			employees[i].address = scan.nextLine();

			System.out.print("������ �Է��ϼ���: ");
			employees[i].salary = scan.nextInt();

			System.out.print("��ȭ ��ȣ�� �Է��ϼ���: ");
			employees[i].phone = scan.next();
		}

		// employees �迭�� ����� ��� �����͸� ����Ѵ�. �ݺ������� ����Ѵ�.
		for (Employee value : employees) {
			System.out.println("�̸�: " + value.name + ", �ּ�: " + value.address + ", ����: " + value.salary 
					+ ", ��ȭ ��ȣ: " + value.phone);
		}

	}

}
