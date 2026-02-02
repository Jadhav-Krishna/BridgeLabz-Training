package collectors.libraryBookStatistics;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Book> books = List.of(
                new Book("Book A", "Fiction", 300),
                new Book("Book B", "Fiction", 200),
                new Book("Book C", "Fiction", 400),
                new Book("Book D", "Science", 350),
                new Book("Book E", "Science", 400),
                new Book("Book F", "Science", 450)
        );

        Map<String, IntSummaryStatistics> statsByGenre = books.stream().collect(Collectors.groupingBy(Book::getGenre,Collectors.summarizingInt(Book::getPages)));

        statsByGenre.forEach((genre, stats) -> {
            System.out.println("Genre: " + genre);
            System.out.println("Total Pages   : " + stats.getSum());
            System.out.println("Average Pages : " + stats.getAverage());
            System.out.println("Max Pages     : " + stats.getMax());
        });
    }
}
