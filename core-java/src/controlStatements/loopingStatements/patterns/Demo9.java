package controlStatements.loopingStatements.patterns;

public class Demo9 {
    public static void main(String[] args) {
        int number = 60;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }
    }
}
