package designPattern;

public class Librarian extends User {
    public Librarian(String name) {
        super(name);
    }

    @Override
    public void update(String message) {
        System.out.println("Librarian " + getName() + " notified: " + message);
    }
}
