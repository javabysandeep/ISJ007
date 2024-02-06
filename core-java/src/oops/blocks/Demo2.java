package oops.blocks;

public class Demo2 {
    int a;
    {
        System.out.println("instance bloc");
    }
    static {
        System.out.println("static block");
    }
    Demo2(){
        //1.call to the super class constructor or same class constructor if it is there
        // by default super class constructor will be called
        //2. instance block of same class
        System.out.println("zero param constructor");
    }

    public Demo2(int a) {
        this();
        this.a = a;
    }

    public static void main(String[] args) {
       // System.out.println("main method");
        Demo2 demo = new Demo2(10);
    }
}
