package oops.variables;

public class Demo1 {
    int a = 100;
    static int b = 200;

    public static void main(String[] args) {
        Demo1 ref = new Demo1();
        System.out.println("instance variable " + ref.a);
        System.out.println("static variable " + Demo1.b);
        ref.instanceMethod();
    }

    void instanceMethod() {
        System.out.println("instance variable " + this.a);
        System.out.println("instance variable " + a);
        System.out.println("static variable " + Demo1.b);
    }
}
