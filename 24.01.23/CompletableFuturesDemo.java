package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class CompletableFuturesDemo {
    public static void show() {
        //        Completable Future

//        Runnable task1 = () -> System.out.println("a");
//        CompletableFuture<Void> future1 = CompletableFuture.runAsync(task1);

//        Supplier<Integer> task2 = () -> 1;
//        CompletableFuture<Integer> future2 = CompletableFuture.supplyAsync(task2);
//
//        try {
//            Integer result = future2.get();
//            System.out.println(result); // a, 1
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }
//        ----------------------------------------------------------

//        Implementing an Asynchronous API

//        This is a synchronous way of programming:

//        var mailMessage = new MailService();
//        mailMessage.send(); // blocking operation // "Mail was sent." message is gonna terminate after 3 secs (not immediately).
//        System.out.println("Hello World"); // this is also gonna terminate after 3 secs

//        This is an asynchronous way of programming:

//        var mailMessage = new MailService();
//        mailMessage.sendAsync();  // "Mail was sent." message is gonna terminate after 3 secs (not immediately).
//        System.out.println("Hello World"); // now this is also gonna terminate immediately
//
//        try {
////            it's added to see sendAsync method on terminal (The main thread is sleeping 5 secs)
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        --------------------------------------------------

//        Running Code on Completion

//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 1);
//        future.thenRunAsync(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");

//            output:
//            ForkJoinPool.commonPool-worker-1
//            Done
//        });
//-----

//        future.thenRun(() -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println("Done");
//
////            output:
////            main
////            Done
//        });
//-----

//        future.thenAccept(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);

//            output:
//            main
//            1
//        });
//-----

//        future.thenAcceptAsync(result -> {
//            System.out.println(Thread.currentThread().getName());
//            System.out.println(result);

//            output:
//            ForkJoinPool.commonPool-worker-1
//            1
//        });
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        -----------------------------------------------------------

//        Handling Exceptions

//        var future = CompletableFuture.supplyAsync(() -> {
//            System.out.println("Getting the current weather");
//            throw new IllegalStateException();
//        });
//
//        try {
//            var temp = future.exceptionally(e -> 1).get(); // exceptionally() method returns a new CompletableFuture
//            System.out.println(temp);
//
////            output:
////            Getting the current weather
////            1
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            e.getCause(); // in case we want to know a cause
//            throw new RuntimeException(e);
//        --------------------------------------------------------------

//        Transforming a Completable Future

        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> 20);
        future
                .thenApply(CompletableFuturesDemo::toFahrenheit)
                .thenAccept(f -> System.out.println(f));
    }

    public static int toFahrenheit(int celsius) {
        return (int)(celsius * 1.8) + 32;
    }
}
