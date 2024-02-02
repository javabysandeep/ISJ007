package oops.thisKeyword;

public class Demo1 {
    int a = 1;
    static int b = 2;
   // static Demo1 demo1 = new Demo1();

    void accept(int a, int b) {
        System.out.println("Local Variable " + a + "\t" + b);
        System.out.println("Instance Variable " + this.a);
        System.out.println("Static Variable " + Demo1.b);
    }

    public static void main(String[] args) {
        Demo1 demo1 = new Demo1();
       // demo1.accept(10, 20);
        display(100, 200);
    }
    public static void display(int a, int b){
        System.out.println("Local Variable " + a + "\t" + b);//100 200
        System.out.println("Static Variable " + Demo1.b); // 2

        //this is not allowed in static context : static method, static block
        //System.out.println("Instance Variable " + this.a);//
        Demo1 demo1 = new Demo1();
        System.out.println("Instance Variable " + demo1.a);//
    }
}
