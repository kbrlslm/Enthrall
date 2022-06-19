package oopExam;

/*
In 2004, Iphone6 come into the market which inherits Iphone5. Implement it. 
*/
public class Iphone6 extends Iphone5 {
	/*
	 * Write a method inside them related to one of the features like compass and
	 * print out related info. 
	 * What kind of concept you can use to relate to Iphone1 to 6? Instantiate Iphone6 in TestPhone and show how many methods they can
	 * call in TestPhone. [points: 70] . 
	 * 
	 */
	int ramPrice;
	int camaraPrice;
	String processorPrice;
	int totalPrice;
	
	@Override
	public void compass() {
		System.out.println("This is from the Iphone6 method that is overrwutten");
	}
	/* First write about method over loading and method overriding with multiple line comments here
	 * Ans: Method overloading is the same method name with different parameters or signatures. On the other
	 * hand, Method overriding is the same method name and signature, but different logic
	 * 
	 * Now, Think about Iphone6. It also has 6 methods with the same name as
	 * materials(). For example -- They are return type parameterized method (int ramPrice, int
	 * cameraPrice), another one return type parameterized method (int ramPrice, int cameraPrice, String
	 * ProcessorPrice), etc. Can you use the void, parameterized(return type), final (return type), or static (return type)
	 * method here as the same method name? if yes, create them and take more int
	 * variable of your own. What kind of concept you can use? [points: 70].
	 * Instantiate the class in TestPhone and initialize those methods. [points:
	 * 70]. 
	 * Now think about a regular class Name ConfiguredIphone6 which extends
	 * Iphone6. Override those methods of Iphone6 and change the logic at your own to show the
	 * changes. [points: 50]. Show the output in TestPhone (how many methods is
	 * possible to extends). [points: 50]. 
	 * 
	 * Please make sure you organize the code in every class
	 * 
	 * Paste the github link for the package
	 * below
	 * 
	 */
	
	public void materials() {
		System.out.println("From non parameterized method");
	}
	
	public int materials(int ramPrice) {
		return ramPrice;
	}
	
	public String materials(String processorPrice) {
		return processorPrice;
	}
	
	public int materials(int ramPrice, int cameraPrice) {
		return ramPrice + cameraPrice;
	}
	
	public void materials(String processorPrice, int ramPrice) {
		System.out.println("The combine price of processor and ram is:" + Integer.valueOf(processorPrice) + ramPrice);
	}
	
	public final int materialsint(int ramPrice, int cameraPrice, String processorPrice, int totalPrice) {
		totalPrice =  Integer.valueOf(processorPrice) + ramPrice + cameraPrice;
		return this.totalPrice;
	}
	
	public static int materials(int ramPrice, String processorPrice, int cameraPrice) {
		return Integer.valueOf(processorPrice) + ramPrice + cameraPrice;
	}
}
