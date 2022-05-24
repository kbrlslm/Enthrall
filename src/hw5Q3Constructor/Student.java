package hw5Q3Constructor;

public class Student {
	public String stName;
	public int stID;
	public char sex;
	public boolean asProgrammer;
	public float grade;

	public Student() {
		System.out.println("This is from default constructor from Student class.");
	}

	public Student(String stName, int stID, char sex, float grade, boolean asProgrammer) {
		super();
		this.stName = stName;
		this.stID = stID;
		this.sex = sex;
		this.asProgrammer = asProgrammer;
		this.grade = grade;
		System.out.println("Student Name: " + stName + ", ID: " + stID + ", Sex: " + sex + ", Grade: " + grade
				+ " and Java Programmer? Ans: " + asProgrammer + ".");
	}

}
