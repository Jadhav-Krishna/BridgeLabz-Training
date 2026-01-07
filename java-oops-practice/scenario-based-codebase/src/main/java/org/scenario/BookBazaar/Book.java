package org.scenario.BookBazaar;

public class Book implements IDiscountable {
	private String title;
	private String author;
	private double price;
	private int stock;

	Book(String title, String author, double price, int stock){
		this.title = title;
		this.author = author;
		this.price = price;
		this.stock = stock;
	}
	
	double getPrice() {
		return price;
	}
	
	int getStock() {
		return stock;
	}
	
	void updateStock(int quantity) {
		this.stock = stock - quantity;
	}

	@Override
	public double applyDiscount(int quantity) {
		return price * quantity * 0.20;
	}
	
}
