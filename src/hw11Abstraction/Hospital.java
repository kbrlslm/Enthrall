package hw11Abstraction;

public interface Hospital {
	public void emergencyRoom();
	public void surgeryRoom();
	public void cafeteria();
	
	public default void morgue() {
		System.out.println("This is from default method of the Hospital Interface");
	}
	
	public static void pharmacy() {
		System.out.println("This is from the static method of the Hospital Interface");
	}
}
