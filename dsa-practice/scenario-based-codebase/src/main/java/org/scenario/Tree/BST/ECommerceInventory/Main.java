package org.scenario.Tree.BST.ECommerceInventory;

public class Main {
	public static void main(String[] args) {

        Node root = null;

        root = ECommerceInventory.insert(root, 5001, "Laptop", 55000);
        root = ECommerceInventory.insert(root, 3001, "Mobile", 20000);
        root = ECommerceInventory.insert(root, 7001, "Headphones", 3000);
        root = ECommerceInventory.insert(root, 2001, "Keyboard", 1500);
        root = ECommerceInventory.insert(root, 4001, "Mouse", 800);
        root = ECommerceInventory.insert(root, 6001, "Monitor", 12000);

        System.out.println(" Product List (Sorted by SKU):");
        ECommerceInventory.inorder(root);

        System.out.println("\n Searching SKU 4001:");
        Node found = ECommerceInventory.search(root, 4001);
        if (found != null)
            System.out.println("Found -> " + found.name + " | ₹" + found.price);
        else
            System.out.println("Product not found");

        System.out.println("\n Updating Price for SKU 3001:");
        ECommerceInventory.updatePrice(root, 3001, 18000);

        System.out.println("\n Updated Product List:");
        ECommerceInventory.inorder(root);
    }
}
