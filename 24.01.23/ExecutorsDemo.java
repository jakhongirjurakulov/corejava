package executors;

import java.util.concurrent.*;
import java.util.function.Supplier;

public class ExecutorsDemo {
    public static void show() {
//        Callables and Futures

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        try {
//            When we call submit method, it's gonna return Future object immediately (it's not gonna wait 3 secs)
//            Future<Integer> future = executor.submit(() -> {
//                LongTask.simulate();
//                return 1;
//            });
//
//            System.out.println("Do more work");
//            try {
//                Integer result = future.get(); // get() method is blocking method which means that the current method has to wait till its result is gonna be ready
//                System.out.println(result); // Do more work after 3 secs 1
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        finally {
//            executor.shutdown();
//        }
//-------------------------------------------------------------

//        Asynchronous Programming = Non-blocking

//        ExecutorService executor = Executors.newFixedThreadPool(2);
//        try {
//            Future<Integer> future = executor.submit(() -> {
//                LongTask.simulate();
//                return 1;
//            });
//
//            System.out.println("Do more work");
//            try {
//                Integer result = future.get(); // This is against to asynchronous programming (Cause it is blocking). The main thread doesn't have to wait.
//                System.out.println(result);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            } catch (ExecutionException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        finally {
//            executor.shutdown();
//        }
//        --------------------------------------------------------

    }
}
