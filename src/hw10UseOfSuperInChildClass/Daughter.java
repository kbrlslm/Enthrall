package hw10UseOfSuperInChildClass;

public class Daughter extends Father{
	public String birthMonth;
	public int age;
	
	public Daughter() {
		System.out.println("Default constructor is created form Daughter class");
	}
	
	public Daughter(String birthMonth, int age){
		this.birthMonth=birthMonth;
		this.age=age;
		super.familyName="FamilyName";
		super.father();
		super.fatherInfo(birthMonth, age, sex, usCitizen);
		System.out.println("This is from Parameterized Constructor of Daughter Class");
	}
	
	public void daughter() {
		System.out.println("This is from void type method of Daughter class");
	}
	
	public void daughterInfo(String birthMonth, int age) {
		System.out.println("This is from void type parameterized method of Daughter class");
	}
	
}
