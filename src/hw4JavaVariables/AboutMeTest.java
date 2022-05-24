package hw4JavaVariables;

public class AboutMeTest {

	
	
	public static void main(String[] args) {
		AboutMe info = new AboutMe(); //constructor initialized
		//variable initialization for me
		String myName = "Mohammad Islam";
		byte myAge = 27;
		short myDateOfBirth = 1994;
		int mySalary = 128000;
		long myLuckyNumber = 1234568910;
		float myWeight = 138.45f;
		double myHeight = 129.3456789123456;
		char myMiddleInitial = 'K';
		boolean myCitizenshipStatus = false;
		//variable initialization for my friend
		String myFriendName = "Alex";
		byte myFriendAge = 27;
		short myFriendDateOfBirth = 1995;
		int myFriendSalary = 125000;
		long myFriendLuckyNumber = 453568910;
		float myFriendWeight = 138.45f;
		double myFriendHeight = 159.3456789123456;
		char myFriendMiddleInitial = 'L';
		boolean myFriendCitizenshipStatus = true;
		
		info.aboutMe(myName, myAge, myDateOfBirth, mySalary, myLuckyNumber, myWeight, myHeight, myMiddleInitial, myCitizenshipStatus);
		System.out.println();
		info.aboutMe(myFriendName, myFriendAge, myFriendDateOfBirth, myFriendSalary, myFriendLuckyNumber, myFriendWeight, myFriendHeight, myFriendMiddleInitial, myFriendCitizenshipStatus);
	}

	
}
