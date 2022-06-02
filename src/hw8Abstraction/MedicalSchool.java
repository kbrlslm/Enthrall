package hw8Abstraction;

public abstract class MedicalSchool {
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.err.println("This is a non-abstract method inside a MedicalSchool abstract class");
	}
	public MedicalSchool() {
		System.out.println("This is a constructor from MedicalSchool abstract class");
	}
	
}
