package oopExam;

public class TestPhone {

	public static void main(String[] args) {
		/*
Instantiate IPhone1, AppleWatch and Phone inside it. Call all the possible method by each of them. [points: 70] . 
		 */
		Iphone1 iphone1 = new Iphone1();
		AppleWatch appleWatch = new Iphone1();
		Phone phone = new Iphone1();
		iphone1.abstractClassInfo();
		iphone1.appleWatchSeriesInfo();
		iphone1.getInfo();
		iphone1.getUser();
		iphone1.getPrice();
		iphone1.interfaceInfo();
		iphone1.isMadeInUSA();
		iphone1.regularClassInfo();
		iphone1.setInfo("Iphone1 was the first release");
		iphone1.setPrice(750);
		iphone1.setUser('M');
		appleWatch.ababstractClassInfo(-999);
		appleWatch.abstractClassInfo();
		appleWatch.WatchInfo();
		phone.interfaceInfo();
		phone.Wireless();
		Phone.battery();
		
	
		
		/*
Initialize getter and setter methods here from Iphone 1 and print: "I bought this phone in 2000, the price was 750$, user's sex: <put your sex initial> and boolean value for made in USA is: false". [points: 70] . 
		 */
		System.out.println("I bought this phone in 2000, the price was " + iphone1.getPrice() + '$');
		/*
		 *  Instantiate Iphone6 in TestPhone and show how many methods they can call in TestPhone. [points: 70] . 
		 *  Comment out at the end of TestPhone to inform me which is hierarchical inheritance, multilevel inheritance, 
		 *  and single inheritance. [points: 50].
		 */
		
		Iphone6 iphone6 = new Iphone6();
		iphone6.ababstractClassInfo(-999); // hierarchical inheritance
		iphone6.abstractClassInfo(); //hierarchical inheritance
		iphone6.appleWatchSeriesInfo();  //hierarchical inheritance
		iphone6.compass(); //multilevel inheritance
		iphone6.dropBox(); //multilevel inheritance
		iphone6.setInfo("This is iphone 6 version"); //multilevel inheritance
		iphone6.setMadeInUSA(true); //multilevel inheritance
		iphone6.setPrice(1000);//multilevel inheritance
		iphone6.setUser('M'); //multilevel inheritance
		iphone6.getInfo(); //multilevel inheritance
		iphone6.getUser(); //multilevel inheritance
		System.out.println("I bought this phone in 2012, the price was " + iphone6.getPrice() + '$');
	}

}
