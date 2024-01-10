package controlStatements.loopingStatements;

public class Demo8 {
    public static void main(String[] args) {
        //1 to 100 even numbers
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
    }
    //2, 4, 6, 8, 10, .., 100
}
