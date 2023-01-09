package Collections;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class SetDemo {
    public static void show() {
//        Set<String> set = new HashSet<>();
//        set.add("sky");
//        set.add("is");
//        set.add("blue");
//        set.add("blue");
//        Set ony guarantees unique elements not order
//        System.out.println(set);
//        --------------------------------------------

//        Collection<String> collection = new ArrayList<>();
//        Collections.addAll(collection, "a", "b", "c", "c");
//        Set<String> set = new HashSet<>(collection);
//        System.out.println(set);
//        ------------------------------------------------------

        Set<String> set1 = new HashSet<>(Arrays.asList("a", "b", "c"));
        Set<String> set2 = new HashSet<>(Arrays.asList("b", "c", "d"));

//        Union
//        set1.addAll(set2);
//        System.out.println(set1); // - [a, b, c, d]

//        Intersection
//        set1.retainAll(set2);
//        System.out.println(set1); // - [b, c]

//        Difference
        set1.removeAll(set2);
        System.out.println(set1); // - [a]
        set2.removeAll(set1);
        System.out.println(set2); // - [b, c, d]
    }
}
