package hw11Abstraction;

public class ColumbiaUniversity extends MedicalSchool implements University {
	/*
	 * Here 'extends' keyword is used to inherit the property of the 'MedicalSchool'
	 * abstract class. In a regular class, using extends keyword, we can inherit
	 * only one another abstract or regular class But using the 'implements' keyword
	 * we can inherit one or more Interface
	 */

//	public abstract void chemistry() {
//		
//	}
// This method is not possible because the class is non-abstract.
	public void biology() {
		System.out.println(" this is non-abstract method from ColumbiaUniversity non-abstract class");
	}

	public ColumbiaUniversity() {
		System.out.println("Default constructor for the ColumbiaUniversity class");
	}
	
	public static void columbiaUniversity() {
		System.out.println("Static Class of the ColumbiaUniversity class");
	}

	@Override
	public void anatomyLab() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hygiene() {
		// TODO Auto-generated method stub

	}

	@Override
	public void commonRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void laboratory() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void languageClub() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void emergencyRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void surgeryRoom() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cafeteria() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int classSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void playGround() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int teacher() {
		// TODO Auto-generated method stub
		return 0;
	}
}
