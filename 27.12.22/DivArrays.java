public class DivArrays {
    double[] A1;
    double[] A2;

    // конструктор класса
    DivArrays(int n1, double[] _A1, int n2, double[] _A2) {
        // создать массивы
        A1 = new double[n1];
        for (int i = 0; i < n1; i++)
            A1[i] = _A1[i];

        A2 = new double[n2];
        for (int i = 0; i < n2; i++)
            A2[i] = _A2[i];
    }

    // метод, который делит поэлементно массив A1 на массив A2
    // метод возвращает массив типа double
    double[] division() {
        double[] A3;
        int n3;

        // установить наибольший из размеров
        if (A1.length > A2.length)
            n3 = A1.length;
        else
            n3 = A2.length;

        A3 = new double[n3];

        // цикл по i, в цикле обрабатывается исключительная ситуация
        for (int i = 0; i < n3; i++) {
            try {
                // сгенерировать исключение, если деление на 0
                if (A2[i] == 0.0)
                    throw new ArithmeticException();
                A3[i] = A1[i]/A2[i];
            }
            catch (ArithmeticException e) {
                // перехватить деление на 0
//                e.printStackTrace();
                //A3[i] = 0; // просто установить в A3 значение 0
            }
            catch (ArrayIndexOutOfBoundsException e) {
                // перехватить выход индекса за границы массива
                // это случай, когда длины массивов отличаются
                A3[i] = -1;
            }
        }
        return A3;
    }
}
