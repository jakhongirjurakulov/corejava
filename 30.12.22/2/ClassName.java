package generics;

public class ClassName<T> {
    private T x;

    public ClassName(T x) {
        this.x = x;
    }

    public void print() {
        System.out.println(x);
    }

    public T calculate(T x, T y) {
//        compile time-error: java: bad operand types for binary operator '+'
        return x + y;
    }
}
