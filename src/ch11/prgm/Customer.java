package ch11.prgm;

// programming 2¹ø
public class Customer extends Person {
	String cid;
	int mileage;

	public Customer() {
		super();
	}

	public Customer(String name, String addr, String phone, String cid, int mileage) {
		super(name, addr, phone);
		this.cid = cid;
		this.mileage = mileage;
	}

	public String getCid() {
		return cid;
	}

	public void setCid(String cid) {
		this.cid = cid;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	@Override
	public String toString() {
		return super.toString() + ", cid=" + cid + ", mileage=" + mileage;
	}

}
