package hw11Polymorphism;

public class TestFamily {

	public static void main(String[] args) {
		Niece niece = new Niece();
		niece.sister();
		niece.sister(12);
		niece.sister("70");
		niece.sister(12, 23);
		niece.sister(12, "46");
		niece.sister(23, 45, 20);
		niece.sister(12, 20, "40");
		niece.sister(24, "50", 10);
		niece.sister(12, 20, 30, "40");
		niece.sister("45", 10, 20, 30);
		niece.sister(23, 34, 60, "50", 60);
		niece.sister(12, 10, 20, "20", 20, 30);
		Niece.sister("47", 32, 12);

	}

}
