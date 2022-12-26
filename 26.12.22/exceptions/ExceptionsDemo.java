package exceptions;

import java.io.FileReader;
import java.io.IOException;

public class ExceptionsDemo {
//    FileReader reader = null;
    public static void show() throws IOException {

    //       The finally block - this block always will get executed. (whether we'll have an exception or not)
//    ------------------------------------------------------------
//    try {
//        reader = new FileReader("file.txt");
//        var value = reader.read();
////            reader.close(); this code will never be executed
//    }
//    catch(IOException e) {
//        System.out.println("Could not read data.");
//    }
//    finally {
//        if (reader != null) {
//            try {
//                reader.close();
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        }
//    }
//    -------------------------------------------------------------

//    The try-with-resources Statement (better way to release external resources f.e file handels, database connections)

//        try (var reader = new FileReader("file.txt")) {
//            var value = reader.read();
//        }
//        catch (IOException e) {
//            System.out.println("Could not read data.");
//        }
//        --------------------------------------------------------

//        Throwing Exceptions

//        var account = new Account();
//        try {
//            account.deposit(-1);
//        } catch (IOException e) {
//            System.out.println("Logging");
//            throw e;
//        }
//        --------------------------------------------------------

//        Custom Exceptions

//        var account = new Account();
//        try {
//            account.withdraw(10);
//        } catch (InsufficientFundsException e) {
//            System.out.println(e.getMessage());
//        }
//        --------------------------------------------------------

//        Chaining Exception

        var account = new Account();
        try {
            account.withdraw(10);
        } catch (AccountException e) {
            var cause = e.getCause();
            System.out.println(cause.getMessage());
        }

    }
}
