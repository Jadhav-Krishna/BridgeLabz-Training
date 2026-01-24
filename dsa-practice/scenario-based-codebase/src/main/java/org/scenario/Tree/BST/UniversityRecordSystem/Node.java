package org.scenario.Tree.BST.UniversityRecordSystem;

public class Node {
	int rollNo;
	String name;
	Node left, right;
	
	Node(int rollNo, String name){
		this.rollNo = rollNo;
		this.name = name;
		this.left = null;
		this.right = null;
	}
}
