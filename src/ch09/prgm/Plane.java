package ch09.prgm;

// PROGRAMMING 02
public class Plane {
	private String producer;
	private String model;
	private int max;
	
	private static int planes = 0;

	public String getProducer() {
		return producer;
	}

	public void setProducer(String producer) {
		this.producer = producer;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public Plane(String producer, String model, int max) {
		this.producer = producer;
		this.model = model;
		this.max = max;
		
		planes++;
	}

	public Plane() {
		planes++;
	}
	
	public static int getPlanes() {
		return planes;
	}
}
