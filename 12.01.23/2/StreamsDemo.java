package com.worldhello.streams;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamsDemo {
    public static void show() {
//        List<Movie> movies = List.of(
//                new Movie("a", 10),
//                new Movie("b", 15),
//                new Movie("c", 20)
//        );

//        Imperative Programming

//        int count = 0;
//        for (var movie : movies)
//            if (movie.getLikes() > 10)
//                count++;

//        Declarative(Functional) Programming

//        stream() is just a way of getting collection of objects

//        var result = movies.stream()
//                .filter(movie -> movie.getLikes() > 10)
//                .count();
//        System.out.println(result); - 2

//        Streams - to process a collections of data in a declarative way
//       -------------------------------------------------------------------

//        Creating a Stream
//        1. From collections

//        List<Integer> list = new ArrayList<>();
//        list.stream();

//        2. From arrays

//        int[] numbers = {1, 2, 3};
//        Arrays.stream(numbers)
//                .forEach(i -> System.out.println(i));

//        3. From an arbitrary number of object

//        Stream.of(1, 2, 3);
//        var result = Stream.generate(() -> Math.random());
//        result
//                .limit(3)
//                .forEach(n -> System.out.println(n));

//        4. Infinite/finite streams

        Stream.iterate(1, n -> n + 1)
                .limit(10)
                .forEach(n -> System.out.println(n));
    }
}
