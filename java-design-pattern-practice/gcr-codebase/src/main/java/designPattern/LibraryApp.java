package designPattern;

public class LibraryApp {
    public static void main(String[] args) {
        LibraryCatalog catalog = LibraryCatalog.getInstance();

        UserFactory factory = new UserFactory();
        User student = factory.createUser("student", "Ava");
        User faculty = factory.createUser("faculty", "Dr. Kumar");

        String title = "Data Structures by Cormen";
        catalog.subscribe(title, student);
        catalog.subscribe(title, faculty);

        Book book = new Book.Builder(title)
                .addAuthor("Cormen")
                .addAuthor("Leiserson")
                .addAuthor("Rivest")
                .addAuthor("Stein")
                .edition("3rd")
                .genre("Computer Science")
                .subGenre("Algorithms")
                .publisher("MIT Press")
                .build();

        catalog.addBook(book, true);
    }
}
