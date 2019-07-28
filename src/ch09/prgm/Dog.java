package ch09.prgm;
// PROGRAMMING 01
public class Dog {

	private String name;
	public String breed;
	private int age;

	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
		this.breed = null;
	}

	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
}
