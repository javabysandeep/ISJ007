package oops.nestedClasses;

public class LocalInnerClassDemo {
    public static void main(String[] args) {
        class A {
            int a = 100;
        }
        A a = new A();
        System.out.println(a.a);
    }
}
