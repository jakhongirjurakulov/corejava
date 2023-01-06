package com.worldhello.generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
//    After using Iterable interface we can iterate objects without knowing GenericList implementation details
    private T[] items = (T[]) new Object[10];
    private int count;

    public void add(T item) {
        items[count++] = item;
    }

    public T get(int index) {
        return items[index];
    }

    @Override
    public Iterator<T> iterator() {
        return null;
    }
}
