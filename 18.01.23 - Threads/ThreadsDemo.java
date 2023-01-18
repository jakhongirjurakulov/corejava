package threads;

import java.util.ArrayList;
import java.util.List;

public class ThreadsDemo {
    public static void show() {
//        Starting a thread

//        System.out.println(Thread.currentThread().getName());
//
//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }

//        output:

//        main
//        Downloading a fileThread-0
//        Downloading a fileThread-1
//        Downloading a fileThread-2
//        Downloading a fileThread-3
//        Downloading a fileThread-4
//        Downloading a fileThread-5
//        Downloading a fileThread-6
//        Downloading a fileThread-7
//        Downloading a fileThread-8
//        Downloading a fileThread-9
//        ----------------------------------------------------------

//        Pausing a thread

//        for (var i = 0; i < 10; i++) {
//            Thread thread = new Thread(new DownloadFileTask());
//            thread.start();
//        }

//        Output:

//        Downloading a fileThread-1
//        Downloading a fileThread-0
//        Downloading a fileThread-2
//        Downloading a fileThread-3
//        Downloading a fileThread-4
//        Downloading a fileThread-5
//        Downloading a fileThread-6
//        Downloading a fileThread-7
//        Downloading a fileThread-8
//        Downloading a fileThread-9

//        After 5 secs

//        Download completedThread-8
//        Download completedThread-9
//        Download completedThread-7
//        Download completedThread-5
//        Download completedThread-6
//        Download completedThread-3
//        Download completedThread-2
//        Download completedThread-4
//        Download completedThread-1
//        Download completedThread-0
//        ---------------------------------------------------

//        Joining a Thread

//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            thread.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        System.out.println("File is ready to be scanned.");
//        ----------------------------------------------------

//        Interrupting a Thread

//        Thread thread = new Thread(new DownloadFileTask());
//        thread.start();
//
//        try {
//            Thread.sleep(1000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        thread.interrupt(); // - it doesn't force a tread to stop rather it simply sends interrupt request to the thread.
//        ------------------------------------------------------------------------------------------------------------------

//        Concurrency Issues (Race Condition, Visibility Problem) - Thread-safe Code

//        Race Conditions

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
//        ----------------------------------------------------------------

//        Strategies for Thread Safety
//        1. Confinement - restrict each thread to have its own data.
//        2. Immutability - using unchanged(immutable) object. Threads can only read objects, they cannot modify them.
//        3. Synchronization - to prevent multiple threads to access the same object concurrently. (by locks) AVOID IT AS MUCH AS POSSIBLE.
//        4. Atomic Objects (Atomic Classes) - these classes allow as achieve thread safety without using locks.
//        5. Partitioning data into segments that can be accessed concurrently.
//        ---------------------------------------------------------------------------
    }
}
