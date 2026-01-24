package org.scenario.Tree.BST.ECommerceInventory;

public class ECommerceInventory {
	
//	insert
	static Node insert(Node root, int sku, String name, double price) {
		if(root == null) return new Node(sku,name,price);
		if(sku < root.sku) {
			root.left = insert(root.left,sku,name,price);
		}else {
			root.right = insert(root.right,sku,name,price);
		}
		return root;
	}
	
//	search
	static Node search(Node root, int sku) {
		if(root == null || root.sku == sku) return root;
		if(sku < root.sku) {
			return search(root.left , sku);
		}else {
			return search(root.right, sku);
		}
	}
	
//	update
    static void updatePrice(Node root, int sku, double newPrice) {
    	Node updatePrice = search(root, sku);
    	if(updatePrice != null) {
    		updatePrice.price = newPrice;
    		System.out.println("updated");
    	}else {
    		System.out.println("Not updated");
    	}
    }
    
//    inorder
    static void inorder(Node root) {
    	if(root == null) return;
    	inorder(root.left);
    	System.out.println("SKU : " + root.sku + "Name : " + root.name + "Price : " + root.price);
    	inorder(root.right);
    }
    
}
