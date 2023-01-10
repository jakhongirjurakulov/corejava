package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void show() {
//        Java: Map
        Customer c1 = new Customer("a", "e1");
        Customer c2 = new Customer("b", "e2");

        Map<String, Customer> map = new HashMap<>();
        map.put(c1.getEmail(), c1);
        map.put(c2.getEmail(), c2);

//        System.out.println(map);

//        Instead of iterating
//        Customer customer = map.get("e1");
//        System.out.println(customer);

//        Customer customer = map.get("e10");
//        System.out.println(customer); - null

//        Customer unknown = new Customer("Unknown", "");
//        Customer customer = map.getOrDefault("e10", unknown);
//        System.out.println(customer); - Unknown

//        Boolean exists = map.containsKey("e10");
//        System.out.println(exists); - false

//        map.replace("e1", new Customer("a++", "e1"));
//        System.out.println(map);

//        Map is not iterable
//        for (var item : map)

//        for (var key : map.keySet())
//            System.out.println(key); - e1, e2

//        for (var entry : map.entrySet())
//            System.out.println(entry); - e1=a, e2=b

        for (var customer : map.values())
            System.out.println(customer);
    }
}
