package com.worldhello.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {
    public static void show() {
//        sayHello(null);

//        checked exception
//        var reader = new FileReader("file.txt");
//        unchecked exceptions (run-time exceptions)
//        sayHello(null);
//        f.e: NullPointerException, ArithmeticException, IllegalArgumentException, IndexOutOfBoundsException, IllegalStateException

//        try {
//            var reader = new FileReader("file.txt");
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        }

//        try {
//            var reader = new FileReader("file.txt");
//            System.out.println("File opened");
//        } catch(FileNotFoundException ex) {
//            System.out.println(ex.getMessage());
//        }

        //        Catching Multiple Types of Exceptions
//        try {
//            var reader = new FileReader("file.txt");
//            var value = reader.read();
//            new SimpleDateFormat().parse("");
//        }
//        catch (IOException | ParseException e) {
////            this is Polimorfism.
////            IOException class may take form of FileNotFoundException class
////            IOException ex = new FileNotFoundException();
//            System.out.println("Could not read data.");
//        }
//        catch (ParseException e) {
//            throw new RuntimeException(e);
//        }


//        catch (FileNotFoundException e) { we don't need this exception because: java.lang.Exception
        //            e.printStackTrace();                                           //java.io.IOException
                                                                                        //java.io.FileNotFoundException
//        }
    }

//    public static void sayHello(String name) {
//        System.out.println(name.toUpperCase());
//    }
}
