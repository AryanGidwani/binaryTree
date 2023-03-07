package main;
public class StudentInfo {
	// creates attributes required for binary tree
	public int studentNumber;
	public String firstName;
	public String lastName;
	public StudentInfo left;
	public StudentInfo right;
	
	public StudentInfo(int sN, String fN, String lN) {
		// initializes attributes
		studentNumber = sN;
		firstName = fN;
		lastName = lN;
		left = null;
		right = null;
	}

}