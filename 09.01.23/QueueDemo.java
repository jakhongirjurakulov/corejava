package Collections;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
    public static void show() {
        Queue<String> queue = new ArrayDeque<>();
        queue.add("a");
        queue.add("b");
        queue.add("c");
//        System.out.println(queue);

//        System.out.println(queue.element());

//        peek and element are the same, only difference:
//        System.out.println(queue.peek()); - returns null if an array is empty
//        System.out.println(queue.element()); - throws NoSuchElement exception

//        poll and remove are the same, only difference:
//        System.out.println(queue.poll()); - retrieves removed element
//        System.out.println(queue.remove()); - throws NoSuchElement exception

    }
}
