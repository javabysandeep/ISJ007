package oops.nestedClasses.innerClass;

public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
        System.out.println("Inner class member "+inner.x);
        inner.m1();

    }
}
