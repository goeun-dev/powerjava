package ch10.lab;

import java.util.Scanner;

public class EmployeeTest {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 크기가 3인 Employee의 배열 employees를 생성한다.
		Employee[] employees = new Employee[1];

		// 3명의 사원 정보를 받아서 각각 Employee 객체를 생성한 후에 배열에 추가하여 본다.
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee();

			System.out.print("이름을 입력하세요: ");
			employees[i].name = scan.next();

			System.out.print("주소를 입력하세요: ");
			employees[i].address = scan.nextLine();

			System.out.print("연봉을 입력하세요: ");
			employees[i].salary = scan.nextInt();

			System.out.print("전화 번호를 입력하세요: ");
			employees[i].phone = scan.next();
		}

		// employees 배열에 저장된 모든 데이터를 출력한다. 반복루프를 사용한다.
		for (Employee value : employees) {
			System.out.println("이름: " + value.name + ", 주소: " + value.address + ", 연봉: " + value.salary 
					+ ", 전화 번호: " + value.phone);
		}

	}

}
