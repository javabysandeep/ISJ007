package oops.thisKeyword;

public class Demo2 {
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        System.out.println(add(a, b));//3000
        System.out.println("a variable vaule in main method = "+a);//100
        System.out.println("b variable vaule in main method = "+b);//200
    }

    private static int add(int a, int b) {
        a = 1000;
        b = 2000;
        return a + b;
    }
}
