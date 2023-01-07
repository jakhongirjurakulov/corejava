package com.worldhello.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionsDemo {
    public static void show() {
//        Collection<String> collection = new ArrayList<>();
//        1.
//        collection.add("a");
//        collection.add("b");
//        collection.add("c");
//        for (var item : collection)
//            System.out.println(item);
//        -------------------------------
//        2.
//        Collections.addAll(collection, "a", "b", "c");
//        System.out.println(collection);
//        for (var item : collection)
//            System.out.println(item);
//        ------------------------------
//        3.
//        System.out.println(collection);
//        System.out.println(collection.size());
//        ------------------------------
//        4.
//        collection.remove("a");
//        System.out.println(collection);
//        -----------------------------
//        5.
//        System.out.println(collection.size());
//        collection.clear();
//        System.out.println(collection);
//        System.out.println(collection.isEmpty());
//        -----------------------------
//        6.
//        var contains = collection.contains("a");
//        System.out.println(contains);
//        ----------------------------
//        7.
//        Object[] objectArray = collection.toArray();
//        String[] stringArray = collection.toArray(new String[0]);
//        stringArray[0].toLowerCase();
//        ----------------------------
        Collection<String> collection = new ArrayList<>();
        Collection<String> other = new ArrayList<>();
        other.addAll(collection);
//        "==" this operator checks int terms of memory allocation
        System.out.println(collection == other);
//        "equals" method checks int terms of content
        System.out.println(collection.equals(other));
    }
}
