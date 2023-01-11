package com.worldhello;

import com.worldhello.lambdas.Equation;
import com.worldhello.lambdas.LambdasDemo;
import com.worldhello.lambdas.Solution;

public class Main {
    public static void main(String[] args) {
//        LambdasDemo.show();

//        Решение квадратного уравнения с помощью лямбда-выражения:
//        a*x^2 + b*x + c = 0.

        Equation eq = (double a, double b, double c) -> {
            double d = b*b - 4*a*c; // дискриминант

            if (d>=0) {
                // Найти корни
                Solution roots = new Solution();
                roots.x1 = Math.abs((-b-Math.sqrt(d))/(2*a));
                roots.x2 = Math.abs((-b+Math.sqrt(d))/(2*a));
                return roots;
            }
            else
                return null;
        };

        Solution roots = eq.CalcEquation(2, 8, 4);
        if (roots == null)
            System.out.println("The solution has no roots");
        else {
            System.out.println("x1 = " + roots.x1);
            System.out.println("x2 = " + roots.x2);
        }

//        Console:
//        x1 = 3.414213562373095
//        x2 = 0.5857864376269049
    }
}