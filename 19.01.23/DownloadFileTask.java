package threads;

public class DownloadFileTask implements Runnable{

    private DownloadStatus status;

    public DownloadFileTask(DownloadStatus status) {
        this.status = status;
    }

//    For Confinement

//    public DownloadFileTask() {
//        this.status = new DownloadStatus();
//    }

//    @Override
//    public void run() {
//        System.out.println("Downloading a file" + Thread.currentThread().getName());
////        Race Conditions
//
//        for (var i = 0; i < 10_000; i++) {
//            if (Thread.currentThread().isInterrupted()) return;
//            status.incrementTotalBytes();
//        }
//
//        System.out.println("Download completed" + Thread.currentThread().getName());
//    }
//    ----------------------------------------------------------------------------------

//    For The volatile Keyword
    @Override
    public void run() {
        System.out.println("Downloading a file" + Thread.currentThread().getName());

        for (var i = 0; i < 1_000_000; i++) {
            if (Thread.currentThread().isInterrupted()) return;
            status.incrementTotalBytes();
        }

//        status.done();
        synchronized (status) {
            status.notifyAll();
        }

        System.out.println("Download completed" + Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
