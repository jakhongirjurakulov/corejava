package executors;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class CompletableFuturesDemo {
    public static void show() {
//        Composing Completable Future

//        id -> e-mail
//        email -> playlist
//        CompletableFuture<String> future = CompletableFuture.supplyAsync(() -> "email");
//        future
//           .thenCompose(email -> CompletableFuture.supplyAsync(() -> "playlist"))
//           .thenAccept(playlist -> System.out.println(playlist));
//------

//        Improving the code above

//        getEmailAsync()
//             .thenCompose(CompletableFuturesDemo::getPlaylistAsync)
//             .thenAccept(playlist -> System.out.println(playlist));
//    }
//
//    public static CompletableFuture<String> getEmailAsync() {
//        return CompletableFuture.supplyAsync(() -> "email");
//    }
//
//    public static CompletableFuture<String> getPlaylistAsync(String email) {
//        return CompletableFuture.supplyAsync(() -> "playlist"); // -playlist
//        ----------------------------------------------------------------------

//        Combining Completable Futures

//        var first = CompletableFuture.supplyAsync(() -> "20USD").thenApply(str -> {
//                                            var price = str.replace("USD", "");
//                                            return Integer.parseInt(price);
//                                        });
//
//        var second = CompletableFuture.supplyAsync(() -> 0.8);
//
//        first.thenCombine(second, (price, exchangeRate) -> price * exchangeRate)
//                .thenAccept(result -> System.out.println(result)); // - 16.0
//        -----------------------------------------------------------------------

//        Waiting for Many Tasks to Complete

//        CompletableFuture<Integer> first = CompletableFuture.supplyAsync(() -> 1);
//        CompletableFuture<Integer> second = CompletableFuture.supplyAsync(() -> 2);
//        CompletableFuture<Integer> three = CompletableFuture.supplyAsync(() -> 3);
//
//        CompletableFuture<Void> all = CompletableFuture.allOf(first, second, three);
//        all.thenRun(() -> {
//            try {
//                var firstResult = first.get();
//                System.out.println(firstResult);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//            System.out.println("All tasks completed successfully");
//        });

//        output:
//        1
//        All tasks completed successfully
//        ---------------------------------------------------------------

//        Waiting for Many tasks to complete

//        CompletableFuture<Integer> slowServer = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 20;
//        });
//
//        CompletableFuture<Integer> fastServer = CompletableFuture.supplyAsync(() -> 20);
//
//        CompletableFuture<Void> fastest = CompletableFuture.anyOf(slowServer, fastServer)
//                .thenAccept(tempResult -> System.out.println(tempResult)); // - 20
//        ---------------------------------------------------------------------------

//        Handling Timeouts

//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 1;
//        });
//
//        try {
//            Integer result = future.orTimeout(1, TimeUnit.SECONDS).get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        output:
//        java.util.concurrent.ExecutionException: java.util.concurrent.TimeoutException
//-----

//        CompletableFuture<Integer> future = CompletableFuture.supplyAsync(() -> {
//            LongTask.simulate();
//            return 1;
//        });

//        Here we are providing with default value to escape exception
//        try {
//            Integer result = future.completeOnTimeout(1, 1, TimeUnit.SECONDS).get();
//            System.out.println(result);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        } catch (ExecutionException e) {
//            throw new RuntimeException(e);
//        }

//        output: 1
    }
}
