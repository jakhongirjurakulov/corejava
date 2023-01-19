package threads;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ThreadsDemo {
    public static void show() {
//        Confinement - each thread has its own object.

//        List<Thread> threads = new ArrayList<>();
//        List<DownloadFileTask> tasks = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            var task = new DownloadFileTask();
//            tasks.add(task);
//
//            Thread thread = new Thread(task);
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        Integer totalBytes = tasks.stream()
//                .map(task -> task.getStatus().getTotalBytes())
//                .reduce(0, (a, b) -> a + b);
//
//        System.out.println(totalBytes);

//        Output:

//        Downloading a fileThread-1
//        Downloading a fileThread-0
//        Downloading a fileThread-2
//        Downloading a fileThread-3
//        Download completedThread-0
//        Download completedThread-1
//        Downloading a fileThread-4
//        Download completedThread-3
//        Downloading a fileThread-5
//        Downloading a fileThread-6
//        Download completedThread-2
//        Download completedThread-4
//        Downloading a fileThread-7
//        Downloading a fileThread-8
//        Downloading a fileThread-9
//        Download completedThread-5
//        Download completedThread-6
//        Download completedThread-7
//        Download completedThread-8
//        Download completedThread-9
//        100000
//        ----------------------------------------------------------

//        Locks - preventing threads to access shared object at the same time. (Synchronization)

//        DownloadStatus status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

//        Output:

//        Downloading a fileThread-1
//        Downloading a fileThread-0
//        Downloading a fileThread-2
//        Download completedThread-1
//        Download completedThread-0
//        Download completedThread-2
//        Downloading a fileThread-3
//        Download completedThread-3
//        Downloading a fileThread-4
//        Downloading a fileThread-5
//        Downloading a fileThread-8
//        Downloading a fileThread-7
//        Download completedThread-5
//        Download completedThread-7
//        Download completedThread-4
//        Download completedThread-8
//        Downloading a fileThread-9
//        Download completedThread-9
//        Downloading a fileThread-6
//        Download completedThread-6
//        100000
//        -----------------------------------

//        The volatile Keyword - guarantees that the changes are visible across threads.

//        DownloadStatus status = new DownloadStatus();
//
//        Thread thread1 = new Thread(new DownloadFileTask(status));
//        Thread thread2 = new Thread(() -> {
//            while (!status.isDone()) {}
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();

//        Output:

//        Downloading a fileThread-0
//        1000000
//        Download completedThread-0
//        ----------------------------------------

//        Thread Signalling with wait() and notify()

//        DownloadStatus status = new DownloadStatus();
//
//        Thread thread1 = new Thread(new DownloadFileTask(status));
//        Thread thread2 = new Thread(() -> {
//            while (!status.isDone()) {
//                synchronized (status) {
//                    try {
//                        status.wait();
//                    } catch (InterruptedException e) {
//                        throw new RuntimeException(e);
//                    }
//                }
//            }
//            System.out.println(status.getTotalBytes());
//        });
//
//        thread1.start();
//        thread2.start();

//        Output:

//        Downloading a fileThread-0
//        1000000
//        Download completedThread-0
//        -----------------------------------------

//        Atomic Objects

//        DownloadStatus status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

//        Output:

//        Downloading a fileThread-2
//        Downloading a fileThread-3
//        Downloading a fileThread-0
//        Downloading a fileThread-4
//        Downloading a fileThread-5
//        Downloading a fileThread-1
//        Downloading a fileThread-6
//        Download completedThread-3
//        Download completedThread-5
//        Download completedThread-2
//        Downloading a fileThread-7
//        Download completedThread-0
//        Downloading a fileThread-8
//        Download completedThread-6
//        Download completedThread-4
//        Download completedThread-1
//        Downloading a fileThread-9
//        Download completedThread-7
//        Download completedThread-9
//        Download completedThread-8
//        10000000
//        -------------------------------------------

//        Adders

//        DownloadStatus status = new DownloadStatus();
//
//        List<Thread> threads = new ArrayList<>();
//
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask(status));
//            thread.start();
//            threads.add(thread);
//        }
//
//        for (var thread : threads) {
//            try {
//                thread.join();
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        System.out.println(status.getTotalBytes());

//        Synchronized Collections

//        Collection<Integer> collection = Collections.synchronizedCollection(new ArrayList<>());
//
//        var thread1 = new Thread(() -> {
//            collection.addAll(Arrays.asList(1, 2, 3));
//        });
//
//        var thread2 = new Thread(() -> {
//            collection.addAll(Arrays.asList(4, 5, 6));
//        });
//
//        thread1.start();
//        thread2.start();
//
//        try {
//            thread1.join();
//            thread2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println(collection); - [1, 2, 3, 4, 5, 6]
//        -------------------------------------------------------------

//        Concurrent Collections

//        This is not thread-safe:
//        Map<Integer, String> map = new HashMap<>();
//        map.put(1, "a");
//        map.get(1);
//        map.remove(1);

//        This is thread-safe:
        Map<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "a");
        map.get(1);
        map.remove(1);
    }
}
