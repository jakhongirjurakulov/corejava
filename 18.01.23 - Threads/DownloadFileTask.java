package threads;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

    @Override
    public void run() {
        System.out.println("Downloading a file" + Thread.currentThread().getName());

//        Pausing a Thread

//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        -------------------------------------------------------------------------------

//        Interrupting a Thread

//        for (var i = 0; i < Integer.MAX_VALUE; i++) {
//            if (Thread.currentThread().isInterrupted()) return;
//            System.out.println("Downloading byte " + i);
//        }
//
//        System.out.println("Download completed" + Thread.currentThread().getName());
//        -------------------------------------------------------------------------------

//        Race Conditions

        for (var i = 0; i < 10_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

        System.out.println("Download completed" + Thread.currentThread().getName());
    }
}
