package LibraryBooks;

import java.util.*;
public class LibraryBooks {
    public static void main(String[] args) {
        Book book1 = new Book("2 states", "Chetan Bhagat");
        Book book2 = new Book("1984", "George Orwell");
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald");

        Library library1 = new Library("City Library");
        Library library2 = new Library("University Library");

        library1.addBook(book1);
        library1.addBook(book2);

        library2.addBook(book2);
        library2.addBook(book3);

        library1.displayBooks();
        library2.displayBooks();
    }
}


