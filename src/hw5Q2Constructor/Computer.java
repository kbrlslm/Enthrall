package hw5Q2Constructor;

public class Computer {
	public String brand;
	public String model;
	public String operatingSyatem;
	public int price;
	public char grade;
	public boolean madeInUSA;

	public Computer() {
		System.out.println("This is from default Constructor of Computer class.");
	}

	public Computer(String brand) {
		this.brand = brand;
	}

	public Computer(String brand, String model, String operatingSyatem, int price, char grade, boolean madeInUSA) {
		super();
		this.brand = brand;
		this.model = model;
		this.operatingSyatem = operatingSyatem;
		this.price = price;
		this.grade = grade;
		this.madeInUSA = madeInUSA;
		System.out.println("My Brand: " + brand + ", Model: " + model + ", Operationg System: " + operatingSyatem
				+ ", price: $" + price + ", Grade: " + grade + ", Made in USA? Ans: " + madeInUSA + ".");
	}

}
