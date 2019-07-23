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
		
		// C = 5/9*(F-32); 의 결과가 항상 0인 이유
		// 5/9의 결과는 0이기 때문에 두 피연산자 중 어느 한쪽을 반드시 float나 double로 해야만 실수 형태의 결과를 얻을 수 있다.
		C = 5/(double)9*(F-32);
		
		System.out.println("화씨 온도: "+F+", 섭씨 온도: "+C);

	}

}
