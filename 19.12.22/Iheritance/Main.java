public class Main {
    public static void main(String[] args) {
//       Inheritance (from Parent to Child)

//        var control = new TextBox();
//        control.disable();
//        System.out.println(control.isEnabled());

//        The Object Class

//        var box1 = new TextBox();
//        var box2 = box1;
//        var box3 = new TextBox();
//        System.out.println(box1.hashCode());
//        System.out.println(box2.hashCode());
//        System.out.println(box3.hashCode());
//        System.out.println(box1.equals(box2));
//        System.out.println(box1.equals(box3));
//        System.out.println(box1.toString());

//        Constructors and Inheritance

//        var textBox = new TextBox();

//        Access Modifiers

//        Private fields and methods are not accessible outside of class. They can't be inherited.

//        Overriding methods

        var box = new TextBox();
        box.setText("Textbox");
        System.out.println(box.toString());
    }
}