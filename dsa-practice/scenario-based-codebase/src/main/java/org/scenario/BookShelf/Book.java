package org.scenario.BookShelf;

class Book {
    String name;

    Book(String name) {
        this.name = name;
    }

    public boolean equals(Object o) {
        Book b = (Book) o;
        return name.equals(b.name);
    }

    public int hashCode() {
        return name.hashCode();
    }
    
    @Override
    public String toString() {
        return name;
    }
}
