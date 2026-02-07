package designPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LibraryCatalog {
    private static final LibraryCatalog INSTANCE = new LibraryCatalog();
    private final List<Book> books = new ArrayList<>();
    private final Map<String, List<NotificationObserver>> subscribers = new HashMap<>();

    private LibraryCatalog() {
    }

    public static LibraryCatalog getInstance() {
        return INSTANCE;
    }

    public void addBook(Book book, boolean available) {
        books.add(book);
        if (available) {
            notifySubscribers(book.getTitle(), "Book available: " + book.getTitle());
        } else {
            notifySubscribers(book.getTitle(), "New arrival: " + book.getTitle());
        }
    }

    public void subscribe(String title, NotificationObserver observer) {
        subscribers.computeIfAbsent(title, k -> new ArrayList<>()).add(observer);
    }

    private void notifySubscribers(String title, String message) {
        List<NotificationObserver> list = subscribers.get(title);
        if (list == null) {
            return;
        }
        for (NotificationObserver observer : list) {
            observer.update(message);
        }
    }
}
