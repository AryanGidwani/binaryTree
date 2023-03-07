package main;

public class MyBinaryTree {
	// creates attributes necessary for the tree
	public StudentInfo root;
	public int numInTree;
	
	public MyBinaryTree() {
		// initializes attributes
		root = null;
		numInTree = 0;
	}
	
	public void addToTree(StudentInfo currentNode, StudentInfo studentToAdd) {
		// adds the number to the tree if the root of the tree being examined is null
		if (root == null) {
			root = studentToAdd;
			numInTree++;
			return;
		}
		
		// adds numbers to the left if the student number is less than the number in the current node using recursion
		if (studentToAdd.studentNumber < currentNode.studentNumber) {
			if (currentNode.left == null) {
				currentNode.left = studentToAdd;
				numInTree++;
			}
			
			else {
				addToTree(currentNode.left, studentToAdd);
			}
		}
		
		// adds number to the right if the student number is greater than the number in the current node using recursion
		if (studentToAdd.studentNumber > currentNode.studentNumber) {
			if (currentNode.right == null) {
				currentNode.right = studentToAdd;
				numInTree++;
			}
			
			else {
				addToTree(currentNode.right, studentToAdd);
				// recursively calls the method again using the number on the right side of the currentNode: this process can repeat itself
			}
		}
	}
	
	// method that prints the root at the start
	public void preorder(StudentInfo currentNode) {
		if (root!= null) {
			System.out.println(currentNode.studentNumber); // prints the root of the tree if the root of the tree being examined isn't empty
			if (currentNode.left != null) {
				preorder(currentNode.left);
			}
			
			if (currentNode.right!= null) {
				preorder(currentNode.right);
			}
		}
		
		else {
			System.out.println("The tree is empty!");
		}
	}
	
	// method that prints the root at the end
	public void postorder(StudentInfo currentNode) {
		if (root!= null) {
			if (currentNode.left != null) {
				postorder(currentNode.left);
			}
			
			if (currentNode.right!= null) {
				postorder(currentNode.right);
			}
			System.out.println(currentNode.studentNumber);
		}
		
		else {
			System.out.println("The tree is empty!");
		}
	}
	
	// method that prints the numbers in row, and the root in the middle
	public void inorder(StudentInfo currentNode) {
		if (root!= null) {
			if (currentNode.left != null) {
				postorder(currentNode.left);
			}
			System.out.println(currentNode.studentNumber);
			if (currentNode.right!= null) {
				postorder(currentNode.right);
			}
			
		}
		else {
			System.out.println("The tree is empty!");
		}
	}

}
