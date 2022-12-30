package generics;

public class Utils {
    public static <T extends Comparable<T>> T max(T first, T second) {
        return (first.compareTo(second) < 0) ? second : first;
    }

    public static <K, V> void print(K key, V value) {
        System.out.println(key + " = " + value);
    }

    public static void printUser(User user) {
        System.out.println(user);
    }

//    <?> is gonna create a class under the hood f.e CAP#1 extends User {} - this is gonna be a regular class
    public static void printUserList(GenericList<? super User> users) {

//        GenericList<? extends User> - with extend keyword wa can just read "users"
//        User x = users.get(0);
//---------------------------------------------
//        with super keyword we can add
        users.add(new User(1));
        users.add(new Instructor(1));
    }
}
