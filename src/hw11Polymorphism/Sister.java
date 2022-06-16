package hw11Polymorphism;

public class Sister {
	public int age1;
	public int age2;
	public int age3;
	public String age4;
	public int age5;
	public int age6;

	public Sister() {
		System.out.println("Default constructor from Sister Class is created");
	}

	public void sister() {
		System.out.println("A");
	}

	public int sister(int age1) {
		return age1;
	}

	public void sister(int age1, int age2) {
		System.out.println("B");
	}

	public void sister(int age1, int age2, int age3) {
		System.out.println("C");
	}

	public void sister(int age1, int age2, int age3, String age4) {
		System.out.println("D");
	}

	public void sister(int age1, int age2, int age3, String age4, int age5) {
		System.out.println("E");
	}

	public final void sister(int age1, int age2, int age3, String age4, int age5, int age6) {
		System.out.println("F");
	}

	public String sister(String age4) {
		return age4;
	}

	public static void sister(String age4, int age1, int age2) {
		System.out.println("G");
	}

	public void sister(int age1, String age4, int age2) {
		System.out.println("H");
	}

	public void sister(int age1, int age2, String age4) {
		System.out.println("I");
	}

	public void sister(String age4, int age1, int age2, int age3) {
		System.out.println("J");
	}

	public void sister(int age6, String age4) {
		System.out.println("K");
	}

	/*
	 * Method overloading is the same method name with different combination of
	 * parameter/parameters It occurs during compile time, that is why this is
	 * called compile time Polymorphism
	 */

}
