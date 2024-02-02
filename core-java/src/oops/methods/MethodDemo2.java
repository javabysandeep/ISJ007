package oops.methods;

public class MethodDemo2 {
    public static void main(String[] args) {
        System1.out.println();
    }
}
class PrintStream1{
    void println(){
        System.out.println("custom print method");
    }
}
class System1{
    static PrintStream1 out = new PrintStream1();
}
