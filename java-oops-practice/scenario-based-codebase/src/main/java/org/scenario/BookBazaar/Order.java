package org.scenario.BookBazaar;

public class Order {
	private Book[] books = new Book[5];
	private int[] quantities = new int[5];
	private String status = "CREATED";
	
	private int count = 0;
	
	void addBook(Book book, int quantity) {
		books[count] = book;
		quantities[count] = quantity;
		book.updateStock(quantity);
		count++;
	};
	
	double calculateTotal() {
        double total = 0;

        for (int i = 0; i < count; i++) {
            double price = books[i].getPrice();
            double discount = books[i].applyDiscount(quantities[i]);
            total += (price * quantities[i]) - discount;
        }
        return total;
	};
	
	private void updateStatus(String status) {
		this.status = status;
	}
}
