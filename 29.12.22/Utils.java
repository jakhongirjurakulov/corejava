package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
//        first way
//        int result = first.compareTo(second);
//        if (result > 0)
//            return first;
//        else if (result < 0)
//            return second;
//        return null;

//        second way
        return (first.compareTo(second) < 0) ? second : first;
    }

    //      Multiple Type Parameters

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

    public static void printUserList(GenericList<User> users) {

    }
}
