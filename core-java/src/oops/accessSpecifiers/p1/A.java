package oops.accessSpecifiers.p1;

public class A {
    public int p = 100;
    private int q = 200;
    protected int r = 300;
    int s = 400;

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.p);
        System.out.println(a.q);
        System.out.println(a.r);
        System.out.println(a.s);
    }
}
