package hw11Abstraction;

public interface University extends College, Hospital {
	/*
	 * Here only one keyword 'extends' is use to inherit the property of the College
	 * and Hospital Interface. One Interface can inherit only one or more
	 * Interface(s), it cannot inherit regular or abstract class, because it listed
	 * of the the hierarchy
	 */
	public int classSize();

	public void playGround();

	public int teacher();
	// try to declare constructor
	// University(){
	//
	// }
	/*
	 * This is not possible to declare or implement a constructor, because as the
	 * constructor is initialized when an object of the class is created. And we
	 * know that we cannot create an object of interface, therefore it's not
	 * possible
	 */

	public default void gymnasium() {
		System.out.println("This is from default method of the University Interface");
	}

	public static void library() {
		System.out.println("This is from the static method of the University Interface");
	}
}
