package executors;

import java.time.Duration;
import java.time.LocalTime;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class CompletableFuturesDemo {
    public static void show() {
        LocalTime start = LocalTime.now();

        FlightService service = new FlightService();
        List<CompletableFuture<Void>> futures = service.getQuotes()
                .map(future -> future.thenAccept(System.out::println))
                .collect(Collectors.toList());

        CompletableFuture.allOf(futures.toArray(new CompletableFuture[0])).thenRun(() -> {
            LocalTime end = LocalTime.now();
            Duration result = Duration.between(start, end);
            System.out.println("Retrieved all quotes in " + result.toMillis() + "msec.");
        });
        try {
            Thread.sleep(10_000); // this is because of LongTask.simulate(3000)
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
