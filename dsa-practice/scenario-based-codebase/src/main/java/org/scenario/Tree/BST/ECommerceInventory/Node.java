package org.scenario.Tree.BST.ECommerceInventory;

public class Node {
	int sku;
	String name;
	double price;
	Node left, right;
	
	Node(int sku, String name, double price){
		this.left = null;
		this.right = null;
		this.sku = sku;
		this.name = name;
		this.price = price;
	}

}
