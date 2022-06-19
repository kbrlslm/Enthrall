package oopExam;

import java.lang.reflect.Method;

/*
1)  Can you make a relation of Iphone1 with Phone Interface and AppleWatch Abstract class. [Complete the code after answering above]. [points: 30] . 

 */

public class Iphone1 extends AppleWatch implements Phone {
	
	private int price;
	private String info;
	private char user;
	private boolean madeInUSA;
	public boolean support3G;
	
	
	public Iphone1() {
		System.out.println("This is default method");
	}

	

	public Iphone1(int price, String info, char user, boolean madeInUSA) {
		this.price = price;
		this.info = info;
		this.user = user;
		this.madeInUSA = madeInUSA;
	}



	@Override
	public void interfaceInfo() {
		System.out.println("Tis method is overwritten");
		
	}



	/*2)
	 * Assume 4 private variables here -- price (as int), Info (as String), user (as a char, M or F), madeInUSA (as boolean)
	 * inside Iphone1 class. If the variables are private how can you use those
	 * variable? What kind of concept you can use? use it just after the variables.
	 * get the out come in TestPhone class. Complete this action and go to next.
	 */
	
	/*Using the encapsulation we can use the value of the variable in different class. But to access that 
	 * variables, we need to create accessors and mutators as public*/
	
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public char getUser() {
		return user;
	}

	public void setUser(char user) {
		this.user = user;
	}

	public boolean isMadeInUSA() {
		return madeInUSA;
	}

	public void setMadeInUSA(boolean madeInUSA) {
		this.madeInUSA = madeInUSA;
	}
	
	/*
	 * 3) Again, here in Iphone1, we got 4 private variables we know. Create 2
	 * constructors inside it using that 4 private variables -- default and
	 * parameterized after those variables (obviously before methods and after
	 * variables), now go to Iphone2 class.
	 */
	
	
	
	/*
	 * 1)
	 * Create a method - regularClassInfo and print out all the features of a
	 * regular class compared with Interface and Abstract class you know.
	 */
	
	public void regularClassInfo() {
		System.out.println("Regular class can create instances without the help of any other class,"
				+ "\nwhether Interface and Abstract Class need help of regular class to be inisiated."
				+ "\nRegular class cannot hold any abstract type or default type methods. Inside the"
				+ "\nregular class all unempliment method must have to be overwritten if needed.");
	}
	
	/*
	 * Write a method inside them related to one of the features like youtube and
	 * print out related info.
	 */
	public void youTube() {
		System.out.println("This is from the youTube method of Iphone1 Class");
	}
}
