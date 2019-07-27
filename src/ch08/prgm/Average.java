package ch08.prgm;

// 7¹ø
public class Average {
	public static int getAverage(int a, int b) {
		return (a + b) / 2;
	}

	public static int getAverage(int a, int b, int c) {
		return (a + b + c) / 3;
	}

	public static void main(String[] args) {
		System.out.println(getAverage(2, 6));
		System.out.println(getAverage(2, 6, 10));
	}
}
