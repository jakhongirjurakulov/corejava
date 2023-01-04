package com.worldhello;
import com.worldhello.generics.GenericClass;
import com.worldhello.generics.GenericMatrix;

public class Main {
    public static void main(String[] args) {
//        Пример обобщенного класса, который реализует метод поиска элемента в двумерной матрице
//        int count;
//
//        Integer[][] MI = {
//                { 2, 5, -8 },
//                { 3, 1, 5 },
//                { 4, 8, 2 },
//                { 5, 2, 8 }
//        };

//        GenericMatrix<Integer> obj = new GenericMatrix<>();
//        count = obj.SearchKey(MI, 4, 3, 2);
//        System.out.println("count = " + count); // count = 3

//        Double[][] MI = {
//                { 2.5, 5.1, -8.3 },
//                { 3.6, 1.8, 5.1 },
//                { 4.7, 8.9, 2.4 },
//                { 5.1, 2.1, 8.9 }
//        };
//
//        GenericMatrix<Double> obj = new GenericMatrix<>();
//        count = obj.SearchKey(MI, 4, 3, 5.1);
//        System.out.println("count = " + count); // count = ? didn't worked (no desired )
//        ----------------------------------------------------------------------------------------------------------

//        Циклический сдвиг в массиве обобщенного типа

//        String
        String[] AS = { "1", "2", "3", "4", "5" };
        GenericClass<String> obj = new GenericClass<>();
        obj.Print(AS, "Before: ");
        obj.CyclicShift(AS, 3, true); // сдвинуть на 3 позиции влево
        obj.Print(AS, "After:");
        obj.CyclicShift(AS, 3, true); // сдвинуть на 3 позиции вправо
        obj.Print(AS, "After:");

//        Double
//        Double[] AD = { 1.5, 1.3, 1.1, 0.8, 0.5, 0.2 };
//        GenericClass<Double> objD = new GenericClass<>();
//
//        objD.Print(AD, "Before: ");
//        objD.CyclicShift(AD, 2, false); // Сдвинуть на 2 позиции вправо
//        objD.Print(AD, "After:");
//
//        // Integer
//        Integer[] AI = { 5, 3, 2, -1, -8, 4, 3, 0, 12 };
//        GenericClass<Integer> objI = new GenericClass<>();
//        objI.Print(AI, "Array AI. Before:");
//        objI.CyclicShift(AI, 6, true); // сдвинуть на 6 позиций влево
//        objI.Print(AI, "Array AI. After: ");

// ---------------------------------------------------------------------------------------------------
    }
}