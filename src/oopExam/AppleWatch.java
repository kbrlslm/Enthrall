package oopExam;

/*
 write inside multiple line comments what you know about Abstract class
Here, Can you make a relationship of AppleWatch with Watch, DigitalWatch, and AppleWatchSeries5? [points: 70] . 
 */
/*
Abstract class is one kind of class that can hold abstract method and non-abstract method as well.
the class cannot be initialized without the help of it's child class. It also can hole the static type method,
but not default type method.
*/

public abstract class AppleWatch extends AppleWatchSeries5 implements Watch, DigitalWatch {
	/*
	 * Can you create a variable and constructor inside Abstract Class? Can you
	 * instantiate it?
	 */
	/*Yes, we can create constructor, but we cannot instantiate this class without the help of other class*/
	public AppleWatch() {
		System.out.println("Default constructor from AppleWatch abstract class");
	}
	/*
	 * Create 2 method: One is abstractClassInfo [which is a non-abstract method,
	 * print out all the features of an abstract class compared with Interface,
	 * regular class]. what type of method would be the other one if the name is
	 * appleWatchInfo? Please create this method
	 */
	public void abstractClassInfo() {
		System.out.println("Abostract class can contain abstract and noo-abstract method, and abstract"
				+ "\n method must have to contain the abstract keyword. However, an Interface, all method must be abstract in nature"
				+ "\nno method can be implemented except static and default type, and cannot be initiated without the help of other child class."
				+ "\nOn the other hand, In a regular class, all methods must be implemented, no abstract method is allowed here. It can contain"
				+ "\nstatic method. This class can be initiated without the help of other class.");
	}
	
	// If we use the same name, with different signature, that is call method overloading
	public void ababstractClassInfo(int a) {
		System.out.println("This is method overloading");
	}
}
