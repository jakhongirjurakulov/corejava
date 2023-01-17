package streams;
import java.util.*;
import java.util.stream.Collectors;

public class StreamsDemo {
    public static void show() {
//        Peeking Elements

        List<Movie> movieList = List.of(
                new Movie("a", 10),
                new Movie("b", 20),
                new Movie("c", 30)
        );

//        movieList.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .peek(m -> System.out.println("filtered: " + m.getLikes()))
//                .map(Movie::getTitle)
//                .peek(t -> System.out.println("mapped: " + t))
//                .forEach(System.out::println);

//        Output:
//        filtered: 20
//        mapped: b
//                b
//        filtered: 30
//        mapped: c
//                c
//        -------------------------------------------------------------------------

//        Simple Reducer

//        anyMatch()
//        var result = movieList.stream()
//                .anyMatch(movie -> movie.getLikes() > 10);
//
//        System.out.println(result); - true

//        allMatch()
//        var result = movieList.stream()
//                .allMatch(movie -> movie.getLikes() > 10);
//
//        System.out.println(result); - false

//        noneMatch
//        var result = movieList.stream()
//                .noneMatch((movie -> movie.getLikes() < 20)); -false
//
//        System.out.println(result);

//        findFirst
//        var result = movieList.stream()
//                .findFirst()
//                .get();
//        System.out.println(result.getTitle()); - a

//        findAny
//        var result = movieList.stream()
//                .findAny()
//                .get();
//        System.out.println(result.getTitle()); - a

//        max
//        var result = movieList.stream()
//                .max(Comparator.comparing(Movie::getLikes))
//                .get();
//        System.out.println(result.getTitle()); - c
//        -------------------------------------------------------------------------

//        Reducing a Stream

//        var result = movieList.stream()
//                .map(movie -> movie.getLikes())
//                .reduce(Integer::sum);
//
//        System.out.println(result.orElse(0));

//        var result = movieList.stream()
//                .map(movie -> movie.getLikes())
//                .reduce(0, Integer::sum);
//
//        System.out.println(result);
//        ---------------------------------------------------------------------

//        Collectors

//        Map<String, Integer> result = movieList.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.toMap(Movie::getTitle, Movie::getLikes));
//
//        System.out.println(result);

//        IntSummaryStatistics result = movieList.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .collect(Collectors.summarizingInt(Movie::getLikes));
//
//        System.out.println(result); - IntSummaryStatistics{count=2, sum=50, min=20, average=25,000000, max=30}
    }
}
