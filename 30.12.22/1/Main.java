import generics.*;

public class Main {
    public static void main(String[] args){
//        Wildcards (Generics)

        GenericList<Instructor> instructors = new GenericList<>();
        GenericList<User> users = new GenericList<>();
        Utils.printUserList(users);
    }
}
