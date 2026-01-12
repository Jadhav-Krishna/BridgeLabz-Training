package org.scenario.BookShelf;

public class Main {
    public static void main(String[] args) {

        BookShelf shelf = new BookShelf();

        shelf.addBook("Fiction", new Book("Harry Potter"));
        // duplicate
        shelf.addBook("Fiction", new Book("Harry Potter")); 
        shelf.addBook("Fiction", new Book("Alchemist"));

        shelf.borrowBook("Fiction", new Book("Harry Potter"));

        shelf.showBooks("Fiction");
    }
}
