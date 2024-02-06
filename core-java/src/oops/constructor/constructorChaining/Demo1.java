package oops.constructor.constructorChaining;

public class Demo1 {
    int a;
    int b;
    int c;
    int d;

    // all argument constructor
    public Demo1(int a, int b, int c, int d) {
        //call zero parameterized constructor from all argument constructor
        //this();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    // no arguments or zero parameterized constructor
    public Demo1() {
        //call all argument constructor from zero parameterized constructor
        this(1,2,3,4);
        System.out.println("zero param or no argument constructor");
    }

    public static void main(String[] args) {
       // Demo1 ref = new Demo1(1,2,3,4);
        Demo1 ref = new Demo1();
    }

}
