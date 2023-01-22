package com.worldhello.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsDemo {
    public static void show() {
//        Executors

//        ExecutorService executor = Executors.newFixedThreadPool(2); // at compile time the type is ExecutorService
//        System.out.println(executor.getClass().getName()); // at run-time the type is ThreadPoolExecutor
//        executor.submit(() -> {
//            System.out.println(Thread.currentThread().getName()); // pool-1-thread-1
//        });
//-----

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        for (int i = 0; i < 10; i++)
//            executor.submit(() -> {
//                System.out.println(Thread.currentThread().getName());
//            });

//        Output:
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-2
//        pool-1-thread-1
//-----

//        When we run this, it isn't gonna terminate. We need to explicitly shut down via shutdown() method

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        executor.submit(() -> {
//            System.out.println(Thread.currentThread().getName());
//        });
//        executor.shutdown();
//-----

        ExecutorService executor = Executors.newFixedThreadPool(2);
//        With this (try and finally block) we make sure no matter what we always shut down an executor and rise it from memory.
        try {
            executor.submit(() -> {
                System.out.println(Thread.currentThread().getName());
            });
        }
        finally {
            executor.shutdown();
        }
    }
}
