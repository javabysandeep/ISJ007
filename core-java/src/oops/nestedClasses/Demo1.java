package oops.nestedClasses;

public class Demo1 {
    //static nested class
    static class A {
        static int a = 100;
    }

    //non-static nested class or inner class
    class B {
       // static int a = 100;
    }

    public static void main(String[] args) {
        // local inner class : without static keyword
        class C {
           // static int a = 100;
        }
    }


}
