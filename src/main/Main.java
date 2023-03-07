package main;

public class Main {

	public static void main(String[] args) {
		MyBinaryTree theTree = new MyBinaryTree();
		StudentInfo theStudent = new StudentInfo(71, "Aryan", "Gidwani");
		
		theTree.addToTree(theTree.root, theStudent);

	}

}
