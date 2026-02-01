package streamAPI.movies;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<Movie> movies = Arrays.asList(
                new Movie("3 Idiots", 8.4, 2009),
                new Movie("Oppenheimer", 8.9, 2023),
                new Movie("Dangal", 8.3, 2016),
                new Movie("PK", 8.1, 2014),
                new Movie("The Batman", 8.2, 2022),
                new Movie("RRR", 7.8, 2022),
                new Movie("Gully Boy", 7.9, 2019),
                new Movie("Avengers Endgame", 8.4, 2019),
                new Movie("Gangubai Kathiawadi", 7.8, 2022),
                new Movie("Inception", 8.8, 2010),
                new Movie("Laal Singh Chaddha", 5.6, 2022)
        );

        MovieService service = new MovieService();
        service.getTop5TrendingMovies(movies).forEach(System.out::println);
    }
}

