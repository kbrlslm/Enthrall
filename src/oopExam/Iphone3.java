package oopExam;

/*
 NOW, Iphone1 came in 2000, but the new model Iphone2, Iphone3 came in 2001. 
 Assume Iphone1 is a superclass and Iphone2, Iphone3 is the child class of the Iphone1. Implement that here.

 */

public class Iphone3 extends Iphone1 {
/*	Write a method inside them related to one of the features like ---- map (use in Iphone3 and print out "Map is introduce in Iphone3. The price is increased to 780$").
 */
	public void iphone3Feature() {
		super.support3G=true;
		super.abstractClassInfo();
		super.appleWatchSeriesInfo();
		super.getInfo();
		super.getPrice();
		super.getUser();
		super.isMadeInUSA();
		super.WatchInfo();
		super.interfaceInfo();
	}
	
}
