package ch09.prgm;

//PROGRAMMING 02
public class PlaneTest {

	public static void main(String[] args) {
		Plane p1, p2, p3;
		p1 = new Plane();
		p2 = new Plane("go air", "G290", 500);
		p3 = new Plane();

		p1.setMax(300);
		p1.setModel("A380");
		p1.setProducer("air");

		System.out.println(p2.getMax());

		int p = Plane.getPlanes();
		System.out.println("积己等 厚青扁 俺荐 = " + p);
	}

}
