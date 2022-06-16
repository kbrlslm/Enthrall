package hw11Polymorphism;

public class Niece extends Sister {
	public Niece() {
		super();
	}

	@Override
	public void sister() {
		System.out.println("AA");
	}

	@Override
	public int sister(int age1) {
		return age1 + 2;
	}

	@Override
	public void sister(int age1, int age2) {
		System.out.println("BB");
	}

	@Override
	public void sister(int age1, int age2, int age3) {
		System.out.println("CC");
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4) {
		System.out.println("DD");
	}

	@Override
	public void sister(int age1, int age2, int age3, String age4, int age5) {
		System.out.println("EE");
	}

	// final method never possible to override
	// public final void sister(int age1, int age2, int age3, String age4, int age5,
	// int age6) {System.out.println("F");}
	@Override
	public String sister(String age4) {
		return age4 + 5;
	}

	// static method never possible to override
	// public static void sister(String age4, int age1, int age2)
	// {System.out.println("G");}
	@Override
	public void sister(int age1, String age4, int age2) {
		System.out.println("HH");
	}

	@Override
	public void sister(int age1, int age2, String age4) {
		System.out.println("II");
	}

	@Override
	public void sister(String age4, int age1, int age2, int age3) {
		System.out.println("JJ");
	}

	@Override
	public void sister(int age6, String age4) {
		System.out.println("KK");
	}

}
