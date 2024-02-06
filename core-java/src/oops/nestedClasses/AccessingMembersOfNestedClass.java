package oops.nestedClasses;

public class AccessingMembersOfNestedClass {
    public static void main(String[] args) {
        Outer.A a = new Outer.A();
        System.out.println("Instance variable " + a.p);
        System.out.println("Static variables " + Outer.A.q);

        Outer outer = new Outer();
        Outer.B b = outer.new B();
        System.out.println("B instnace variable " + b.r);
    }
}
