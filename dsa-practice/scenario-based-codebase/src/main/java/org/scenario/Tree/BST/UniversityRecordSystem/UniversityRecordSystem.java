package org.scenario.Tree.BST.UniversityRecordSystem;

public class UniversityRecordSystem {
	
//	Insert 
	static Node insert (Node root, int roll, String name) {
		if(root == null) return new Node(roll, name);
		if(roll < root.rollNo) {
			root.left = insert(root.left, roll, name);
		}else if(roll > root.rollNo){
			root.right = insert(root.right, roll, name);
		}
		return root;
	}

//	Search
	static Node search(Node root, int roll) {
		if(root == null || root.rollNo == roll) return root;
		if(roll < root.rollNo) {
			return search(root.left, roll);
		}else {
			return search(root.right, roll);
		}
	}
	
//	Find MIN
	static Node findMin(Node root) {
		while(root.left != null) {
			root = root.left;
		}
		return root;
	}
	
//    Inorder traversal
    static void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.println("Roll: " + root.rollNo + " | Name: " + root.name);
            inorder(root.right);
        }
    }
	
//    Delete
    static Node delete(Node root, int roll) {
        if (root == null) return null;

        if (roll < root.rollNo) {
            root.left = delete(root.left, roll);
        } 
        else if (roll > root.rollNo) {
            root.right = delete(root.right, roll);
        } 
        else {
            if (root.left == null && root.right == null)
                return null;

            if (root.left == null)
                return root.right;
            if (root.right == null)
                return root.left;

            Node minNode = findMin(root.right);
            root.rollNo = minNode.rollNo;
            root.name = minNode.name;
            root.right = delete(root.right, minNode.rollNo);
        }
        return root;
    }
	
}
