package com.worldhello.streams;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
//        Mapping Elements

//        1. map()

//        List<Movie> movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );
//
//        movies.stream()
//                .map(list -> list.getTitle())
//                .forEach(n -> System.out.println(n)); - a, b, c


//        2. flatMap() - Stream<List<x>> -> Stream<x>

//        Stream<List<Integer>> stream = Stream.of(List.of(1, 2, 3), List.of(3, 4, 5));
//        stream.forEach(n -> System.out.println(n)); - [1, 2, 3], [3, 4, 5]
//        stream.flatMap(list -> list.stream()).forEach(n -> System.out.println(n)); - 1, 2, 3, 3, 4, 5,
//        ------------------------------------------------------------------------------------------------

//        Filtering Elements

//
//        Predicate<Movie> isPopular = m -> m.getLikes() > 10;
//        movies.stream()
//                .filter(isPopular)
//                .forEach(n -> System.out.println(n.getTitle())); - b, c
//        ------------------------------------------------------------------

//        Slicing Streams

//        limit()

//        movies.stream()
//                .limit(2)
//                .forEach(n -> System.out.println(n.getTitle()));

//        skip()

//        movies.stream()
//                .skip(2)
//                .forEach(n -> System.out.println(n.getTitle())); - c

//        takeWhile()

//        movies.stream()
//                .takeWhile(n -> n.getLikes() < 20)
//                .forEach(n -> System.out.println(n.getTitle())); - a, b

//        The difference between takeWhile and filter methods is:
//        takeWhile stops the moment a condition becomes false (when it gets first wrong element)
//        filter looks through an entire list

//        dropWhile() - this is the opposite of takeWhile

//        movies.stream()
//                .dropWhile(n -> n.getLikes() < 20)
//                .forEach(n -> System.out.println(n.getTitle())); - c
//        ----------------------------------------------------------------------

//        Sorting Streams

        List<Movie> movies = List.of(
                new Movie("b", 10),
                new Movie("a", 15),
                new Movie("c", 20)
        );

//        movies.stream()
//                .sorted(Comparator.comparing(Movie::getTitle))
//                .forEach(m -> System.out.println(m.getTitle())); - a, b, c
    }
}
