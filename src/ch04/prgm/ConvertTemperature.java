package ch04.prgm;

import java.util.Scanner;

// 4. 사용자로부터 화씨 온도를 받아서 섭씨 온도로 환산하여 출력하는 프로그램.
public class ConvertTemperature {

	public static void main(String[] args) {
		double F; // 화씨 온도
		double C; // 섭씨 온도
		
		Scanner input = new Scanner(System.in);
		System.out.print("화씨 온도를 입력하세요: ");
		F = input.nextDouble();
		
		C = (F-32)*5/9;
		
		System.out.println("화씨 온도: "+F+", 섭씨 온도: "+C);

	}

}
