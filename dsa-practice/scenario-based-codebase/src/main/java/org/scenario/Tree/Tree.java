package org.scenario.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class Tree {
	Node root;
	
	void insert(int data) {
		Node newNode = new Node(data);
		if(root == null) {
			root = newNode;
			return;
		}
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			
			Node curr = q.poll();
			
			if(curr.left == null) {
				curr.left = newNode;
				return;
			}else {
				q.add(curr.left);
			}
			
			if(curr.right == null) {
				curr.right = newNode;
				return;
			}else {
				q.add(curr.right);
			}
		}
		
	}
//	Inorder (LNR)
	void inorder(Node data) {
		if(root == null) return;
		inorder(root.left);
		System.out.println(root.data + " ");
		inorder(root.right);
		return;
	}
	
//	PreOrder (NLR)
	void preorder(Node data) {
		if(root == null) return;
		System.out.println(root.data +" ");
		preorder(root.left);
		preorder(root.right);

	}
	
//	PostOrder (LRN)
	void postorder(Node data) {
		if(root == null) return;
		postorder(root.left);
		postorder(root.right);
		System.out.println(root.data + " ");
	}

// Level Order (BSF)
	void levelOrder(Node root) {
		Queue<Node> q = new LinkedList<>();
		q.add(root);
		
		while(!q.isEmpty()) {
			Node curr = q.poll();
			System.out.println(curr.data);
			if(curr.left != null) q.add(curr.left);
			if(curr.right != null) q.add(curr.right);
		}
	}
	
//	Binary Search Tree (BST) Insert
	Node insertBST(Node root, int val) {
		if(root == null) return new Node(val);
		if(val < root.data) {
			root.left = insertBST(root.left, val);
		}else {
			root.right = insertBST(root.right, val);
		}
		return root;
	}
	
	
}
