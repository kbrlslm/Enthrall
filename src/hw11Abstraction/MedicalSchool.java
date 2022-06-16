package hw11Abstraction;

public abstract class MedicalSchool extends NurshingSchool {
	/*Here 'extends word used to inherit the property of other abstract class. Using the 'extends'
	 * keyword one abstract class can only inherit one abstract or regular class. However using the 
	 * 'implements' keyword it can inherit one or more Interface.*/
	public abstract void anatomyLab();
	public void biochemistryLab() {
		System.err.println("This is a non-abstract method inside a MedicalSchool abstract class");
	}
	public MedicalSchool() {
		System.out.println("This is a constructor from MedicalSchool abstract class");
	}
	
	public static void medicalSchool() {
		System.out.println("Static method of MedicalSchool abstract class");
	}
	
}
