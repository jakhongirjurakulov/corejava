package com.worldhello.generics;

public class GenericMatrix<T> {
    // Метод, который осуществляет подсчет количества элементов key в двумерной матрице M.
    public int SearchKey(T[][] M, int m, int n, T key) {
        int count = 0;
        for (int i=0; i<m; i++)
            for (int j=0; j<n; j++)
                if (key==M[i][j])
                    count++;
        return count;
    }
}
