package threads;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
//    private int totalBytes;
    private int totalFiles;
//    private Object totalBytesLock = new Object();
//    private Object totalFilesLock = new Object();
//    private volatile boolean isDone;

//    Atomic objects
//    private AtomicInteger totalBytes = new AtomicInteger();
//    -------------------------------------------------------
//    Lock - Synchronization
//    private Lock lock = new ReentrantLock();
//    ------------------------------------------
//    Adder
    private LongAdder totalBytes = new LongAdder();

    public void incrementTotalBytes() {
//        lock.lock();
//        try {
//            totalBytes++;
//        }
//        finally {
//            lock.unlock();
//        }
//        ---------------------
//        The synchronized Keyword

//        synchronized (totalBytesLock) {
//            totalBytes++;
//        }
//        ----------------------
//        totalBytes++;
//        ----------------------

//        Atomic objects
//        totalBytes.incrementAndGet();
//        ------------------------------

//        Adder
        totalBytes.increment();
    }

//    public void incrementTotalFiles() {
//        synchronized (totalFilesLock) {
//            totalFiles++;
//        }
//    }

    public int getTotalBytes() {
        return totalBytes.intValue();
//        --------------------
//        return totalBytes.get();
//        ------------------------
    }

    public int getTotalFiles() {
        return totalFiles;
    }

//    public synchronized boolean isDone() {
//        return isDone;
//    }
//
//    public synchronized void done() {
//        isDone = true;
//    }
}
