import java.awt.*;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Arrays
//        int[] numbers = {2, 5, 8, 1, 4};
//
//        System.out.println(numbers.length);
//
//        System.out.println(Arrays.toString(numbers));
//
//        Arrays.sort(numbers);
//
//        System.out.println(Arrays.toString(numbers));


//        Multidimensional Arrays
//
//        int[][] numbers = new int[2][3];
//        numbers[0][0] = 1;
//        System.out.println(Arrays.toString(numbers));
//
//        int[][] numbers1 = {{1, 2, 3}, {4, 5, 6}};
//        System.out.println(Arrays.deepToString(numbers1));

//        Constants
//        final float PI = 3.14F;
//        PI = 1;
//        System.out.println(PI);

//        Arithmetic Expressions
//        int result = 10 / 3;
//        System.out.println(result);
//
//        double result1 = (double) 10 / (double) 3;
//        System.out.println(result1);
//
//        int x = 1;
//        x++;
//        System.out.println(x);
//
//        ++x;
//        System.out.println(x);
//        int x1 = 1;
//        int y1 = x1++;
//        System.out.println(x1);
//        System.out.println(y1);
//
//        int x2 = 1;
//        int y2 = ++x2;
//        System.out.println(x2);
//        System.out.println(y2);
//
//        int x3 = 1;
//        x3 = x3+ 2;
//        System.out.println(x3);
//        x3 += 2;
//        System.out.println(x3);

//        Casting
//        Implicit Casting
//        short x = 1;
//        int y = x + 1;
//        System.out.println(y);
//
//        Explicit Casting
//        double x1 = 1.1;
//        int y1 = (int)x1 + 2;
//        System.out.println(y1);
//
//        String x2 = "1";
//        int y2 = Integer.parseInt(x2) + 1;
//        System.out.println(y2);

//        Math Class
//        int result = Math.round(1.1F);
//        System.out.println(result);
//
//        int result1 = (int) Math.ceil(1.1F);
//        System.out.println(result1);
//
//        int result2 = (int) Math.floor(1.1F);
//        System.out.println(result2);
//
//        int result3 = (int) Math.max(1, 2);
//        System.out.println(result3);

//        int result4 = (int) Math.round(Math.random() * 100);
//        System.out.println(result4);

//        int result5 = (int) (Math.random() * 100);
//        System.out.println(result5);

//        Formatting Numbers
//        NumberFormat currency = NumberFormat.getCurrencyInstance();
//        String result = currency.format(125);
//        System.out.println(result);

        String result1 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result1);
    }
}