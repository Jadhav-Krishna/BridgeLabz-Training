package org.scenario.BookBazaar;

public class PrintedBook extends Book{

	PrintedBook(String title, String author, double price, int stock) {
		super(title, author, price, stock);
	}
	
	@Override
	public double applyDiscount(int quantity) {
		return getPrice() * quantity * 0.10;
	}

}
