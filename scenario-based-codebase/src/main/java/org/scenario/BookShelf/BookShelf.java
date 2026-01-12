package org.scenario.BookShelf;

import java.util.*;

class BookShelf {

    HashMap<String, HashSet<Book>> catalog = new HashMap<>();

    void addBook(String genre, Book book) {

        if (!catalog.containsKey(genre)) {
            catalog.put(genre, new HashSet<>());
        }

        catalog.get(genre).add(book);
    }

    void borrowBook(String genre, Book book) {
        catalog.get(genre).remove(book);
    }

    void showBooks(String genre) {
        System.out.println(catalog.get(genre));
    }
}
