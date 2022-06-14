package hw10UseOfSuperInChildClass;

public class Father {
	public String name;
	public int age;
	public char sex;
	public boolean usCitizen;
	public String familyName;
	
	public Father() {
		System.out.println("Default constructor is created inside father class");
	}

	public Father(String name, int age, char sex, boolean usCitizen) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.usCitizen = usCitizen;
		System.out.println("Parameterized constructor is created from Father class");
	}
	
	public void father() {
		System.out.println("This is a void type non-perameterized method of father Class");
	}
	
	public void fatherInfo(String name, int age, char sex, boolean usCitizen) {
		System.out.println("This is a void type parametirized method of Father Class");
	}
	
}
