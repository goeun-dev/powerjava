package ch06.prgm;

// 7. 3�� �ݺ����� �̿��Ͽ� ��Ÿ����� ������ �����ϴ� 3���� ������ ã�� ���α׷�.
public class prgm07 {

	public static void main(String[] args) {
		for (int a = 1; a < 100; a++) {
			for (int b = 1; b < 100; b++) {
				for (int c = 1; c < 100; c++) {
					// a=3, b=4 �� �ﰢ���� a=4, b=3 �� �ﰢ���� ���ٰ� �Ǵ��Ͽ� a<b ���� �߰�. 
					if (a<b && a * a + b * b == c * c) {
						System.out.println("a = " + a + ", b = " + b + ", c = " + c);
					}
				}
			}
		}

	}

}
