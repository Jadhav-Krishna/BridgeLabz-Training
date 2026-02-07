package designPattern;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Book {
    private final String title;
    private final List<String> authors;
    private final String edition;
    private final String genre;
    private final String subGenre;
    private final String publisher;

    private Book(Builder builder) {
        this.title = builder.title;
        this.authors = Collections.unmodifiableList(new ArrayList<>(builder.authors));
        this.edition = builder.edition;
        this.genre = builder.genre;
        this.subGenre = builder.subGenre;
        this.publisher = builder.publisher;
    }

    public String getTitle() {
        return title;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public String getEdition() {
        return edition;
    }

    public String getGenre() {
        return genre;
    }

    public String getSubGenre() {
        return subGenre;
    }

    public String getPublisher() {
        return publisher;
    }

    public static class Builder {
        private final String title;
        private final List<String> authors = new ArrayList<>();
        private String edition;
        private String genre;
        private String subGenre;
        private String publisher;

        public Builder(String title) {
            this.title = title;
        }

        public Builder addAuthor(String author) {
            this.authors.add(author);
            return this;
        }

        public Builder edition(String edition) {
            this.edition = edition;
            return this;
        }

        public Builder genre(String genre) {
            this.genre = genre;
            return this;
        }

        public Builder subGenre(String subGenre) {
            this.subGenre = subGenre;
            return this;
        }

        public Builder publisher(String publisher) {
            this.publisher = publisher;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
