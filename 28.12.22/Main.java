import generics.GenericList;
import generics.List;
import generics.User;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
//        Generics
//        The need for Generics

//        var list = new List();
//        list.add(1);
//        list.add("1");
//        list.add(new User("skjdn"));

        //1st problem - should explicitly cast
//        int item1 = (int) list.get(0);
        //2nd problem - ClassCastException
//        int item2 = (int) list.get(1);

//        Generic Classes - we can catch our mistakes at compile time with generics.

//        var list1 = new GenericList<Integer>();
//        list1.add(1);
//        System.out.println(list1.get(0));
//
//        var list2 = new GenericList<User>();
//        list2.add(new User("j.jurakulov@gmail.com"));
//        System.out.println(list2.get(0));

//        Generics and Primitive Types

//        instance of generic class can be only reference type f.e:
//        new GenericList<Object>();
//        new GenericList<User>();
//        new GenericList<String>();

//        we cannot pass primitive type f.e:
//        new GenericList<int>();
//        new GenericList<float>();

//        instead we need to use rapper class f.e:
//        new GenericList<Integer>();
//        new GenericList<Float>();
//        new GenericList<Boolean>();

//        GenericList<Integer> numbers = new GenericList<>();
//        here we don't need to wrap into wrapper class, compiler converts into wrapper class automatically | this is "Boxing"
//        numbers.add(1);
//        this is "Unboxing"
//        int number = numbers.get(0);

//        Constraints - <T extends Number, .....>
//        it should not be a Class it may be an Interface (also multiple interfaces Comparable & Cloneable - <T> - is now bounden type)

//        new GenericList<User>();

//        The Comparable Interface

//        var user1 = new User(1);
//        var user2 = new User(2);
//        System.out.println(user1.compareTo(user2));
    }
}
