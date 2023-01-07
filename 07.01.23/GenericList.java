package com.worldhello.generics;

import java.util.Iterator;

public class GenericList<T> implements Iterable<T>{
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
        return new ListIterator(this);
    }

//    The iterator interface (Nested class)

    private class ListIterator implements Iterator<T> {
        private int item;
        private  GenericList<T> list;

        public ListIterator(GenericList<T> list) {
            this.list = list;
        }

        @Override
        public boolean hasNext() {
            return (item < list.count);
        }

        @Override
        public T next() {
            return list.items[item++];
        }
    }
}
