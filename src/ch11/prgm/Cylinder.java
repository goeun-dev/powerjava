package ch11.prgm;

// programming 1¹ø
class Cylinder extends Circle {
	double height;

	public Cylinder() {

	}

	public Cylinder(double radius) {
		this.radius = radius;
	}

	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}

	public double getHeight() {
		return height;
	}
	
	public double getVolume() {
		return super.getArea() * this.height;
	}
}
