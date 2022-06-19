package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.
 */

public class Iphone2 extends Iphone1 {
	
	private char userOfIphone2 = 'M';
	/*1)
	 *In IPhone2, Initialize a char variable
	 * userOfIphone2 (M or F). create default and parameterized constructor, a void
	 * type method iPhone2Info, a parameterized method with same name iPhone2Info
	 * inside Iphone2 class. Use the super method and super keyword in constructor,
	 * and super keyword in methods of Iphone2. Call constructor and methods. Can
	 * you call variable by super keyword? create a public variable inside Iphone1
	 * and execute it in Iphone2. Execute all of them in TestPhone. [points: 70]
	 */

	public Iphone2() {
		super();
		System.out.println("Default contructor fro Iphone2 class");
	}
	public Iphone2(char userOfIphone2, int price, String info, char user, boolean madeInUSA) {
		super(price, info, user, madeInUSA);
		this.userOfIphone2 = userOfIphone2;
	}
	
	public void iphone2Info() {
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.isMadeInUSA();
		super.support3G = true;
		
	}
	
	public void iphone2Info(char userOfIphone2) {
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.isMadeInUSA();
	}
	
	
	
	/*
	 * Write a method inside them related to one of the features like dropbox and
	 * print out related info.
	 */
	public void dropBox() {
		System.out.println("This is from the dropBox method of Iphone1 Class");
	}
	
}
