package hw11Abstraction;

public interface College {
	public void commonRoom();
	public void laboratory();
	public void languageClub();
	
	public default void dorm() {
		System.out.println("This is from the default method of the College Interface");
	}
	
	public static void studyRoom() {
		System.out.println("This is from the static method of the College Interface");
	}
	
}
