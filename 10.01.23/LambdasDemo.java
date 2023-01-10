package lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class LambdasDemo {
//    public static String prefix = "-";

    public static void show() {
//        greet(new ConsolePrint());
//        ---------------------------------------------

//        Anonymous Inner Classes

//        greet(new Printer() {
//            @Override
//            public void print(String message) {
//                System.out.println(message);
//            }
//        });
//        --------------------------------------------

//        Lambda Expressions

//        greet(message -> System.out.println(message));
//        ------------------------------------------------

//        Variable Capture

//        String prefix = "-";
//        greet(message -> System.out.println(prefix + message));
//        ---------------------------------------------------------

//        Method References

//        greet(System.out::println);
//        ----------------------------------------------------------

//        Built-in Functional Interfaces
//        There are 4 types of FI: Consumer, Supplier, Function, Predicate

//        The Consumer Interface

//        List<Integer> list = List.of(1, 2, 3);

//        Imperative Programming (how should be done)
//        for (var item : list)
//            System.out.println(item);

//        Declarative Programming (what needs to be done)
//        list.forEach(item -> System.out.println(item));
//        -----------------------------------------------------------

//        Chaining Consumer

//        List<String> list = List.of("a", "b", "c");

//        Consumer<String> print = item -> System.out.println(item);
//        Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
//
//        list.forEach(print.andThen(printUpperCase));
//        ------------------------------------------------------------------------------------

//        The Supplier Interface

//        Supplier<Double> randomInteger = () -> Math.random();
//        Double random = randomInteger.get();
//        System.out.println(random);
//        -----------------------------------------------------------

//        The Function Interface

//        Function<String, Integer> map = str -> str.length();
//        Integer length = map.apply("current");
//        System.out.println(length);
//        ---------------------------------------------------------

//        Composing Functions

//        key:value
//        key=value
//        {key=value}

//        Function<String, String> first = str -> str.replace(":", "=");
//        Function<String, String> second = str -> "{" + str + "}";

//        first way
//        String result = second.andThen(first).apply("key:value");
//        System.out.println(result);

//        second way
//        var result = first.compose(second).apply("Key:value");
//        System.out.println(result);
//        ----------------------------------------------------------------
    }


    public static void greet(Printer printer) {
        printer.print("Hello World!");
    }
}
