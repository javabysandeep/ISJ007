package oops.methods;

public class Methods {
    public static void main(String[] args) {
        System.out.println(P.a);
        P.aRef.m1();
    }
}
class P {
    static int a = 100;
    static A aRef = new A();
}
