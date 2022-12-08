package com.worldhello;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Reading Input

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Type your age : ");
//        int age = scanner.nextInt();
//        System.out.println("You are " + age);

//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Name: ");
//        String name = scanner.nextLine().trim();
//        System.out.println("Your name is " + name);

//        --------------------------------------------------------------------

//        Project Mortgage Calculator (Beginning)

//        final byte MONTH_IN_YEAR = 12;
//        final byte PERCENT = 100;
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.print("Principal: ");
//        int principal = scanner.nextInt();
//
//        System.out.print("Annual Interest Rate: ");
//        float annualInterestRate = scanner.nextFloat();
//        float monthlyInterestRate = annualInterestRate / PERCENT / MONTH_IN_YEAR;
//
//        System.out.print("Period (Years): ");
//        byte period = scanner.nextByte();
//        int numberOfPayments = period * MONTH_IN_YEAR;
//
//        double mortgage = principal
//                * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, numberOfPayments)
//                / Math.pow(1 + monthlyInterestRate, numberOfPayments) - 1;
//
//        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
//        System.out.println("Mortgage: " + mortgageFormatted);

//        ---------------------------------------------------------------------------------------

//        Comparison Operators

//        int x = 1;
//        int y = 1;
//        System.out.println(x == y);
//        System.out.println(x != y);
//        System.out.println(x >= y);
//        System.out.println(x <= y);

//        ----------------------------------------------------

//        Logical Operators

//        int temperature = 22;
//        boolean isWarm = temperature > 20 && temperature < 30;
//        System.out.println(isWarm);

//        boolean hasHighIncome = false;
//        boolean hasGoodCredit = true;
//        boolean hasCriminalRecord = false;
//        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasGoodCredit;

//        -------------------------------------------------------------------------

//        If Statement

//        int temperature = 20;
//        if (temperature > 30)
//            System.out.println("It's a hot day. Drink plenty of water!");
//        else if (temperature > 20)
//            System.out.println("It's a nice day!");
//        else
//            System.out.println("It's cold day");

//        -------------------------------------------------------------------------

//        Simplifying If Statement

//        int income = 120_000;
//        boolean hasHighIncome = (income > 100_000);

//        -------------------------------------------------------------------------

//        The Ternary Operator
//        int income = 120_000;
//        String className = income > 100_000 ? "First" : "Economy";

//        --------------------------------------------------------------------------

//        Switch Statement

//        String role = "moderator";
//        switch (role) {
//            case "admin":
//                System.out.println("You are an admin");
//                break;
//            case "moderator":
//                System.out.println("You are a moderator");
//                break;
//            default:
//                System.out.println("You are a guest");
//                break;
//        }

//        -------------------------------------------------------------------------

//        FizzBuzz Exercise
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Number: ");
//        int number = scanner.nextInt();
//        if (number % 5 == 0)
//            if (number % 3 == 0)
//                System.out.println("FizzBuzz");
//            else
//                System.out.println("Fizz");
//        else if (number % 3 == 0)
//            System.out.println("Buzz");
//        else
//            System.out.println(number);

//        ----------------------------------------------

//        For Loops

//        for (int i = 0; i < 5; i++)
//            System.out.println("Hello World " + i);

//        for (int i = 5; i > 0; i--)
//            System.out.println("Hello World " + i);

//        -----------------------------------------------

//        While Loops, Break, Continue

//        Scanner scanner = new Scanner(System.in);
//        String input = "";
////        true = !input.equals("quit") - nimaga?
//        while (true) {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            if (input.equals("pass"))
//                continue;
//            if (input.equals("quit"))
//                break;
//            System.out.println(input);
//        }

//        ----------------------------------------------

//        Do While Loops
//        Scanner scanner = new Scanner(System.in);
//        String input = "";
//        do {
//            System.out.print("Input: ");
//            input = scanner.next().toLowerCase();
//            System.out.println(input);
//        } while (!input.equals("quit");

//        ---------------------------------------------

//      For - Each Loop
//        String[] fruits = {"Apple", "Mango", "Orange"};
////        for (int i = 0; i < fruits.length; i++)
////            System.out.println(fruits[i]);
//
//        for (String fruit : fruits) {
//            System.out.println(fruit);
//        }
    }
}