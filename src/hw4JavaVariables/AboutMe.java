package hw4JavaVariables;

public class AboutMe {

	public String myName;
	public byte myAge;
	public short myDateOfBirth;
	public int mySalary;
	public long myLuckyNumber;
	public float myWeight;
	public double myHeight;
	public char myMiddleInitial;
	public boolean myCitizenshipStatus;
	
	public AboutMe() {
		System.out.println("This is all about me: ");
	}

	public void aboutMe(String myName, byte myAge, short myDateOfBirth, int mySalary, long myLuckyNumber, float myWeight,
			double myHeight, char myMiddleInitial, boolean usCitizenshipStatus) {
		this.myName = myName;
		this.myAge = myAge;
		this.myDateOfBirth = myDateOfBirth;
		this.mySalary = mySalary;
		this.myLuckyNumber = myLuckyNumber;
		this.myWeight = myWeight;
		this.myHeight = myHeight;
		this.myMiddleInitial = myMiddleInitial;
		this.myCitizenshipStatus = usCitizenshipStatus;
		System.out.println("I am " + myName +". I am " + myAge + " years old." +
		"\nI was born in " + myDateOfBirth + ". I earn about $" + mySalary + ".00 dollars per year." +
				"\nMy luckey number is " + myLuckyNumber + ". My weight and height are " + myWeight + " and " + myHeight + " respectively.\nMy middle initial is " +
		myMiddleInitial + " and US citizenship status is " + usCitizenshipStatus +".");
	}
	
	
}
