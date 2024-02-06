package oops.constructor;

public class Demo4 {
    int a;
    int b;
    int c;
    int d;

    //all argument constructor
    public Demo4(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    //no argument constructor
    public Demo4() {
    }

    // parameterized constructor
    public Demo4(int a, int b) {
        this.a = a;
        this.b = b;
    }

}
