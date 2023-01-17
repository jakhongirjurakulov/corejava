package streams;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamsDemo {
    public static void show() {
//        Collectors

        List<Movie> movies = List.of(
                new Movie("a", 10, Genre.ACTION),
                new Movie("b", 20, Genre.COMEDY),
                new Movie("c", 30, Genre.COMEDY)
        );

//        Summing Int

//        var result = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.summingInt(m -> m.getLikes()));
//
//        System.out.println(result); - 50

//        joining()

//        var result = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .map(Movie::getTitle)
//                .collect(Collectors.joining(", "));
//
//        System.out.println(result); - b, c
//        ---------------------------------------------------------------

//        Grouping Elements

//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.counting()));
//        System.out.println(result); - {ACTION=1, COMEDY=2}

//        var result = movies.stream()
//                .collect(Collectors.groupingBy(
//                        Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
//
//        System.out.println(result); - {ACTION=a, COMEDY=b, c}
//        -----------------------------------------------------------------

//        Partitioning Elements

//        var result = movies.stream()
//                .collect(Collectors.partitioningBy(movie -> movie.getLikes() > 20,
//                        Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
//
//        System.out.println(result); - {false=a, b, true=c}
//        ------------------------------------------------------------------

//        Primitive Type Streams

//        IntStream.rangeClosed(1, 5)
//                .forEach(System.out::println); - 1, 2, 3, 4, 5

//        IntStream.range(1, 5)
//                .forEach(System.out::println); - 1, 2, 3, 4
//        -------------------------------------------------------------
        
	var result = movies.stream()
                .mapToDouble(m -> Math.sqrt(m.getLikes())).iterator();
        while(result.hasNext())
            System.out.println(result.next());
    }
}
