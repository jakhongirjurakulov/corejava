package com.worldhello.generics;

public class GenericClass<Type> {
    public void CyclicShift(Type[] A, int count, boolean direction) {
        Type item;
        int iterations = (int)(count % A.length); // убрать лишние итерации

        if(direction) {
            // Сдвиг влево - код не очень понятен
            for (int i=0; i<iterations; i++) {
                item = A[0];
                for (int j=0; j<A.length-1; j++)
                    A[j] = A[j+1];
                A[A.length-1] = item;
            }
        }
        else {
            // Сдвиг вправо - код не очень понятен
            for (int i=0; i<iterations; i++)
            {
                item = A[A.length-1];
                for (int j=A.length-2; j>=0; j--)
                    A[j+1] = A[j];
                A[0] = item;
            }
        }
    }
    public void Print(Type[] A, String text) {
        System.out.println(text);
        for (int i=0; i<A.length; i++) {
            System.out.print(A[i] + " | ");
        }
        System.out.println();
    }
}
