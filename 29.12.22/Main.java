import generics.*;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

public class Main {
    public static void main(String[] args){
//        Generics Methods

//        System.out.println(Utils.max(1.2, 2.1));
//        System.out.println(Utils.max(new User(10), new User(20)));
//        ------------------------------------------------------------

//      Multiple Type Parameters

//        Utils.print(1, "2");
//        ------------------------------------------------------------

//        Generic Classes and Inheritance

        User user = new Instructor(10);
        Utils.printUser(new Instructor(10));

//        This is fine
        GenericList<User> users = new GenericList<>();
        Utils.printUserList(users);

//        This is error - because GenericList<Instructor>() is not subtype of GenericList<User> as it was above.
        GenericList<User> users1 = new GenericList<Instructor>();
        Utils.printUserList(users1);
    }
}
