package ch06.prgm;

// 7. 3중 반복문을 이용하여 피타고라스의 정리를 만족하는 3개의 정수를 찾는 프로그램.
public class prgm07 {

	public static void main(String[] args) {
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					// a=3, b=4 인 삼각형과 a=4, b=3 인 삼각형이 같다고 판단하여 a<b 조건 추가. 
					if (a<b && a * a + b * b == c * c) {
						System.out.println("a = " + a + ", b = " + b + ", c = " + c);
					}
				}
			}
		}

	}

}
