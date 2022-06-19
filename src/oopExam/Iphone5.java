package oopExam;

/*
In 2003, Iphone5 come into the market which inherits Iphone4. Implements it here
 */

public class Iphone5 extends Iphone4 {
	/*	Write a method inside them related to one of the features like email and print out related info. 
	 */
	public void iphone5Feature() {
		super.iphone4Features();
		super.abstractClassInfo();
		super.appleWatchSeriesInfo();
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.isMadeInUSA();
		super.interfaceInfo();
		super.iphone2Info();
		super.iphone2Info(getUser());
		super.WatchInfo();
		super.dropBox();
	}
	
	
	public void compass() {
		System.out.println("This is from compass of the Iphone5 class");
	}
}
