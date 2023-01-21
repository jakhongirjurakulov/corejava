package com.worldhello.lambdas;

public class ThreadsDemo {
    public static void show() {
        int[] arr1 = {1, 2, 3, 4, 5};
        var thread1 = new Thread1(arr1);
        try {
            thread1.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        thread1.getThread().setPriority(10);
        System.out.println(thread1.getPriority()); //- 10
        System.out.println(thread1.getMax()); //- 5
//        -------------------------------------

        double[] arr2 = {1.1, 2.1, 3.1};
        Thread2 thread2 = new Thread2(arr2);
//        System.out.println(thread2.getThread().isAlive()); - true
        try {
            thread2.getThread().join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(thread2.getPriority()); // - 5
        System.out.println(thread2.getSum()); //- 6.300000000000001
    }
}
