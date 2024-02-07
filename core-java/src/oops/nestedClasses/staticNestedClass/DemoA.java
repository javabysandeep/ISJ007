package oops.nestedClasses.staticNestedClass;

public class DemoA {
    public static void main(String[] args) {
        System.out.println("Static nested class static member = "+A.B.y);

        A.B b = new A.B();
        System.out.println("Static nested class instance member = "+b.x);
    }
}
