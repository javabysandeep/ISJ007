package oops;

public class Demo1 {
    public static void main(String[] args) {
        int a = 100;
        m1();
    }

    private static void m1() {
        int b = 200;
        m2();
    }

    private static void m2() {
        int c = 300;
        m3();
    }

    private static void m3() {
        int d = 400;
        System.out.println("m3 method");
    }
}
