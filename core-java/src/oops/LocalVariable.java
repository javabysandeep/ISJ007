package oops;

public class LocalVariable {
    int p; // instance variables and static variables will get the default value
    static int q;

    public static void main(String[] args) {
        int a = 100; // declaration + initialization
        System.out.println("Local variable " + a);
        // local variables must be initialized explicitly. they dont get any default value

        LocalVariable ref = new LocalVariable();
        System.out.println(ref.p);
        System.out.println(LocalVariable.q);
    }
}
