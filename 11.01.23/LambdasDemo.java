package com.worldhello.lambdas;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;
import java.lang.Math;
import java.util.function.UnaryOperator;

public class LambdasDemo {
    public static void show() {
//        The Predicate Interface
//        We use this interface to filter data.

//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        System.out.println(isLongerThan5.test("sky"));

//        Combining Predicates

//        Predicate<String> isLongerThan5 = str -> str.length() > 5;
//        Predicate<String> isLongerThan2 = str -> str.length() > 2;
//        var result = isLongerThan5.and(isLongerThan2).test("sky");
//        System.out.println(result); - false

//        var result = isLongerThan2.or(isLongerThan5).test("sky");
//        System.out.println(result); - true
//        -------------------------------------------------------------

//        The BinaryOperator Interface
//        a, b -> a + b, then square

//        BinaryOperator<Integer> add = (a, b) -> a + b;
//        Function<Integer, Integer> square = a -> a * a;
//        var result = add.andThen(square).apply(1, 2);
//        System.out.println(result);
//        -------------------------------------------------------------

//        The Unary Operator Interface

//        UnaryOperator<Integer> square =  a -> a * a;
//        UnaryOperator<Integer> increment =  a -> a + 1;
//        System.out.println(square.andThen(increment).apply(1));


    };
}
