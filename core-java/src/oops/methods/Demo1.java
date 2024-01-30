package oops.methods;

public class Demo1 {
    public static void main(String[] args) {
        //instance method
        Demo1 ref = new Demo1();
        ref.m1();

        //static method
        Demo1.m2();
        m2();// can be called directly within the same class
        ref.m2();// we can call static methods using reference also

    }

    void m1() {
        System.out.println("m1");
    }

    static void m2() {
        System.out.println("m2");
    }
}
