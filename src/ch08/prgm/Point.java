package ch08.prgm;
// 4¹ø
public class Point {
	int x, y;

	public void setPoint(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public void print() {
		System.out.println("x=" + x + ", y=" + y);
	}

	public static void main(String[] args) {
		Point p = new Point();
		p.setPoint(10, 33);
		p.print();
	}
}
