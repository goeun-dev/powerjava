package ch11.prgm;

// programming 2¹ø
public class Person {
	String name;
	String addr;
	String phone;

	public Person() {

	}

	public Person(String name, String addr) {
		this.name = name;
		this.addr = addr;
	}

	public Person(String name, String addr, String phone) {
		this.name = name;
		this.addr = addr;
		this.phone = phone;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "name=" + name + ", addr=" + addr + ", phone=" + phone + "";
	}
	

}
