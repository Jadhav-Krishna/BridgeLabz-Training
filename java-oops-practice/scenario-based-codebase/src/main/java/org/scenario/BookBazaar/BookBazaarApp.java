package org.scenario.BookBazaar;

public class BookBazaarApp {

	public static void main(String[] args) {

		        Book b1 = new Ebook("2 States", "Chetan Bhagat", 500, 10);
		        Book b2 = new PrintedBook("48 Laws of power", "Robert Greene", 800, 5);

		        Order order = new Order();
		        order.addBook(b1, 1);
		        order.addBook(b2, 2);

		        System.out.println("Total Bill = " + order.calculateTotal());
	}

}
