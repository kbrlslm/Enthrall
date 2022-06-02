package hw8Abstraction;

public interface University {
	public int classSize();

	public void playGround();

	public int teacher();
	// try to declare constructor
	// University(){
	//
	// }
	/*
	 * This is not possible to declare or implement a constructor, because as the
	 * constructor is initialized when an object of the class is created. And we know
	 * that we cannot create an object of interface, therefore it's not possible
	 */
}
