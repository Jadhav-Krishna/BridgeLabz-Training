package streamAPI.movies;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MovieService {

    public List<Movie> getTop5TrendingMovies(List<Movie> movies) {

        return movies.stream().filter(movie -> movie.getRating() >= 8.0).sorted(Comparator.comparing(Movie::getRating).reversed().thenComparing(Movie::getReleaseYear, Comparator.reverseOrder())).limit(5).collect(Collectors.toList());
    }
}
