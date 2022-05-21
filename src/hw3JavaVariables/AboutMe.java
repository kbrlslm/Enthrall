package hw3JavaVariables;

import java.security.Identity;

public class AboutMe {
	// variable declaration
	public String identity = "I am a human being.";
	// variable initialization
	public String myName = "Mohammad Islam";
	public byte myAge = 27;
	public short myDateOfBirth = 1994;
	public int mySalary = 128000;
	public long myLuckyNumber = 1234568910;
	public float myWeight = 138.45f;
	public double myHeight = 129.3456789123456;
	public char myMiddleInitial = 'K';
	public boolean myCitizenshipStatus = false;

	public static void main(String[] args) {
		// instantiation
		AboutMe myInfo = new AboutMe();
		System.out.println("This is " + myInfo.myName + ". I was born in " + myInfo.myDateOfBirth);
	}
}
