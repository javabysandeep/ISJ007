package oops.methods;

public class Demo2 {
    public static void main(String[] args) {
        A a = new A();
        a.m1();

        A.m2();
        a.m2();
        System.out.println("calling instance method of demo2");
        // calling same class instance method
        Demo2 d = new Demo2();
        d.instanceMethod();
    }

    void instanceMethod(){
        A a = new A();
        a.m1();

        A.m2();
        a.m2();
    }
}


