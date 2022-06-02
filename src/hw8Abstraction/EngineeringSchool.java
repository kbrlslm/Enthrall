package hw8Abstraction;

public abstract class EngineeringSchool {
	public abstract void mechanicalLab();
	public void computerLab() {
		System.out.println("This is a non-abstract method inside EngineeringSchool abstract class");
	}
}
