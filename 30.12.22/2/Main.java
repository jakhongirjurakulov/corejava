import generics.ClassName;

public class Main {
    public static void main(String[] args){
//        ClassName<Float> x = new ClassName<>(1.1F);
//        x.print();

        ClassName<Integer> x1 = new ClassName<>(1);
        x1.print();

        int result = x1.calculate(1, 2);
        System.out.println(result);

//        ClassName<String> x2 = new ClassName<>("1.2");
    }
}
